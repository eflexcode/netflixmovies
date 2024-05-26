package com.ifeanyi.netflixmovies.movie.service;

import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.movie.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    Movie create(Movie movie);
    List<Movie> createList(List<Movie> movies);
    Movie update(String id,Movie movie) throws NotFoundException;
    Movie getById(String id) throws NotFoundException;

    List<Movie> getByName(String name);
    List<Movie> getByContentType(String contentType);
    List<Movie> getByGenre(String genre);
    List<Movie> getByDescription(String description);
    List<Movie> getByActors(String actors);
    List<Movie> getByDirector(String director);

    void delete(String id) throws NotFoundException;

}
