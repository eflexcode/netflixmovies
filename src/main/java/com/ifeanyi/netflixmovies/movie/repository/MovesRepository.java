package com.ifeanyi.netflixmovies.movie.repository;

import com.ifeanyi.netflixmovies.movie.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovesRepository extends MongoRepository<Movie,String> {
}
