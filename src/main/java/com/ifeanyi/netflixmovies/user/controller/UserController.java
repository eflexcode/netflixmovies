package com.ifeanyi.netflixmovies.user.controller;

import com.ifeanyi.netflixmovies.exception.AlreadyExistException;
import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.user.entity.User;
import com.ifeanyi.netflixmovies.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User update(@PathVariable String id,@RequestBody User user) throws NotFoundException {
        return userService.update(id, user);
    }
    @PutMapping("/bookmarks/{id}/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public User updateBookmarks(@PathVariable String id, @PathVariable String movieId) throws NotFoundException, AlreadyExistException {
        return userService.updateBookmarks(id, movieId);
    }
    @PutMapping("/interest/{id}/{key}")
    @ResponseStatus(HttpStatus.OK)
    public User updateInterest( @PathVariable String id,@PathVariable String key) throws NotFoundException, AlreadyExistException{
        return userService.updateInterest(id,key);
    }
    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    User getUser(@PathVariable String id) throws NotFoundException{
        return userService.getUser(id);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable String id) throws NotFoundException{
        userService.delete(id);
    }
}
