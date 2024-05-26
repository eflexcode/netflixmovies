package com.ifeanyi.netflixmovies.movie.service;

import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.movie.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie);
    List<Movie> createList(List<Movie> movies);
    Movie update(String id,Movie movie) throws NotFoundException;
    Movie getById(String id) throws NotFoundException;
    void delete(String id) throws NotFoundException;

}
