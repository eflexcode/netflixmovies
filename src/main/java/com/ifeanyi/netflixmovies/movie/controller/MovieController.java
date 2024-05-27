package com.ifeanyi.netflixmovies.movie.controller;

import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.movie.entity.Movie;
import com.ifeanyi.netflixmovies.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public Movie create(@RequestBody Movie movie){
        return movieService.create(movie);
    }
    @PutMapping("/update{id}")
    @ResponseStatus(HttpStatus.OK)
    public Movie update(@PathVariable String id, @RequestBody Movie movie) throws NotFoundException{
        return movieService.update(id, movie);
    }
    @GetMapping("/get{id}")
    @ResponseStatus(HttpStatus.OK)
    public Movie getById(@PathVariable String id) throws NotFoundException{
     return movieService.getById(id);
    }
    @GetMapping("/query")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> query(@RequestParam(required = false) String name,@RequestParam(required = false) String contentType,@RequestParam(required = false) String genre,@RequestParam(required = false) String description,@RequestParam(required = false) String actors,@RequestParam(required = false) String director){
        return movieService.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
   public void delete(@PathVariable String id) throws NotFoundException{
        movieService.delete(id);
    }

}
