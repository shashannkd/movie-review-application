package com.shashannkd.movieshub.service;

import com.shashannkd.movieshub.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getAllMovies();

    Movie getMovieByImdbId(String imdbId);
}
