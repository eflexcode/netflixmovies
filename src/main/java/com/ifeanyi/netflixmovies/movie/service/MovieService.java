package com.ifeanyi.netflixmovies.movie.service;

import com.ifeanyi.netflixmovies.movie.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie);
    List<Movie> createList(List<Movie> movies);
    Movie update(Movie movie);
    Movie getById(String id);
    Movie delete(Movie movie);

}
