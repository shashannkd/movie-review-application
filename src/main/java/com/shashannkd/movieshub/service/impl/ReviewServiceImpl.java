package com.shashannkd.movieshub.service.impl;

import com.shashannkd.movieshub.entity.Movie;
import com.shashannkd.movieshub.entity.Review;
import com.shashannkd.movieshub.repository.ReviewRepository;
import com.shashannkd.movieshub.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Review createReview(String reviewBody, String imdbId, String user) {

        Review review = repository.save(new Review(reviewBody, user,imdbId, new Date()));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
