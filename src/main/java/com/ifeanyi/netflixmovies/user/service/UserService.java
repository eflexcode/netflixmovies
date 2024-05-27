package com.ifeanyi.netflixmovies.user.service;

import com.ifeanyi.netflixmovies.exception.AlreadyExistException;
import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.user.entity.User;

public interface UserService {

    User create(User user);
    User update(String id,User user)throws NotFoundException;
    User updateBookmarks(String id,String movieId) throws NotFoundException, AlreadyExistException;
    User updateInterest(String id,String key) throws NotFoundException, AlreadyExistException;
    User getUser(String id) throws NotFoundException;
    void delete(String id)throws NotFoundException;

}
