package com.ifeanyi.netflixmovies.movie.repository;

import com.ifeanyi.netflixmovies.movie.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovesRepository extends MongoRepository<Movie,String> {

    List<Movie> findByNameContainingIgnoreCase(String name);
    List<Movie> findByContentType(String contentType);
    List<Movie> findByGenre(String genre);
    List<Movie> findByDescriptionContainingIgnoreCase(String description);
    List<Movie> findByActorsContainingIgnoreCase(String actors);
    List<Movie> findByDirectorContainingIgnoreCase(String director);

}
