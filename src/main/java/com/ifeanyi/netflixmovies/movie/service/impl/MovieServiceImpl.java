package com.ifeanyi.netflixmovies.movie.service.impl;

import com.ifeanyi.netflixmovies.exception.NotFoundException;
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
    public Movie update(String id, Movie gottenParams) throws NotFoundException {

        Movie movie = getById(id);
        movie.setMovieUrl(gottenParams.getMovieUrl() != null ? gottenParams.getMovieUrl() : movie.getMovieUrl());
        movie.setName(gottenParams.getName() != null ? gottenParams.getName() : movie.getName());
        movie.setContentType(gottenParams.getContentType() != null ? gottenParams.getContentType() : movie.getContentType());
        movie.setDescription(gottenParams.getDescription() != null ? gottenParams.getDescription() : movie.getDescription());
        movie.setContentRating(gottenParams.getContentRating() != null ? gottenParams.getContentRating() : movie.getContentRating());
        movie.setGenre(gottenParams.getGenre() != null ? gottenParams.getGenre() : movie.getGenre());
        movie.setPoster(gottenParams.getPoster() != null ? gottenParams.getPoster() : movie.getPoster());
        movie.setFormattedDuration(gottenParams.getFormattedDuration() != null ? gottenParams.getFormattedDuration() : movie.getFormattedDuration());
        movie.setReleasedDate(gottenParams.getReleasedDate() != null ? gottenParams.getReleasedDate() : movie.getReleasedDate());
        movie.setActors(gottenParams.getActors() != null ? gottenParams.getActors() : movie.getActors());
        movie.setDirector(gottenParams.getDirector() != null ? gottenParams.getDirector() : movie.getDirector());
        movie.setCreator(gottenParams.getCreator() != null ? gottenParams.getCreator() : movie.getCreator());
        movie.setAudio(gottenParams.getAudio() != null ? gottenParams.getAudio() : movie.getAudio());
        movie.setSubtitle(gottenParams.getSubtitle() != null ? gottenParams.getSubtitle() : movie.getSubtitle());
        movie.setAvailableForOffline(gottenParams.getAvailableForOffline() != null ? gottenParams.getAvailableForOffline() : movie.getAvailableForOffline());
        movie.setNumberOfSeasons(gottenParams.getNumberOfSeasons() != null ? gottenParams.getNumberOfSeasons() : movie.getNumberOfSeasons());
        movie.setSeasonStartDate(gottenParams.getSeasonStartDate() != null ? gottenParams.getSeasonStartDate() : movie.getSeasonStartDate());
        movie.setSource(gottenParams.getSource() != null ? gottenParams.getSource() : movie.getSource());
        movie.setSourceLink(gottenParams.getSourceLink() != null ? gottenParams.getSourceLink() : movie.getSourceLink());
        movie.setUniqId(gottenParams.getUniqId() != null ? gottenParams.getUniqId() : movie.getUniqId());
        movie.setScrapedAt(gottenParams.getScrapedAt() != null ? gottenParams.getScrapedAt() : movie.getScrapedAt());

        return movesRepository.save(movie);
    }

    @Override
    public Movie getById(String id) throws NotFoundException {
        return movesRepository.findById(id).orElseThrow(() -> new NotFoundException("No move found with id: " + id));
    }

    @Override
    public List<Movie> getByName(String name) {
        return movesRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Movie> getByContentType(String contentType) {
        return movesRepository.findByContentType(contentType);
    }

    @Override
    public List<Movie> getByGenre(String genre) {
        return movesRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> getByDescription(String description) {
        return movesRepository.findByDescriptionContainingIgnoreCase(description);
    }

    @Override
    public List<Movie> getByActors(String actors) {
        return movesRepository.findByActorsContainingIgnoreCase(actors);
    }

    @Override
    public List<Movie> getByDirector(String director) {
        return movesRepository.findByDirectorContainingIgnoreCase(director);
    }

    @Override
    public void delete(String id) throws NotFoundException {
        getById(id);
        movesRepository.deleteById(id);
    }

}
