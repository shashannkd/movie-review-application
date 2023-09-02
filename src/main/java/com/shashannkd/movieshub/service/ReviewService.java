package com.shashannkd.movieshub.service;

import com.shashannkd.movieshub.entity.Review;

public interface ReviewService {

    public Review createReview(String reviewBody,String imdbId, String user);

}
