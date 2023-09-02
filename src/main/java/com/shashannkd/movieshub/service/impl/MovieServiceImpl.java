package com.shashannkd.movieshub.service.impl;


import com.shashannkd.movieshub.entity.Movie;
import com.shashannkd.movieshub.repository.MovieRepository;
import com.shashannkd.movieshub.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
