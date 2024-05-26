package com.ifeanyi.netflixmovies.movie.service.impl;

import com.ifeanyi.netflixmovies.movie.entity.Movie;
import com.ifeanyi.netflixmovies.movie.repository.MovesRepository;
import com.ifeanyi.netflixmovies.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovesRepository movesRepository;

    @Override
    public Movie create(Movie movie) {
        return movesRepository.save(movie);
    }

    @Override
    public List<Movie> createList(List<Movie> movies) {
        return movesRepository.saveAll(movies);
    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public Movie getById(String id) {
        return null;
    }

    @Override
    public Movie delete(Movie movie) {
        return null;
    }

}
