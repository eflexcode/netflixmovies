package com.ifeanyi.netflixmovies.user.service.impl;


import com.ifeanyi.netflixmovies.exception.AlreadyExistException;
import com.ifeanyi.netflixmovies.exception.NotFoundException;
import com.ifeanyi.netflixmovies.user.entity.User;
import com.ifeanyi.netflixmovies.user.repository.UserRepository;
import com.ifeanyi.netflixmovies.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(String id, User sentUser) throws NotFoundException {

        User savedUser = getUser(id);
        savedUser.setUsername(sentUser.getUsername() != null ? sentUser.getUsername() : savedUser.getUsername());
        savedUser.setProfileImageUrl(sentUser.getProfileImageUrl() != null ? sentUser.getProfileImageUrl() : savedUser.getProfileImageUrl());

        return userRepository.save(savedUser);
    }

    @Override
    public User updateBookmarks(String id, String movieId) throws NotFoundException, AlreadyExistException {
        User user = getUser(id);
        List<String> interest = user.getBookmarks();
        if (interest.contains(movieId)) {
            throw new AlreadyExistException("Key already exist");
        }

        return userRepository.save(user);
    }

    @Override
    public User updateInterest(String id, String key) throws NotFoundException, AlreadyExistException {

        User user = getUser(id);
        List<String> interest = user.getInterest();
        if (interest.contains(key)) {
            throw new AlreadyExistException("Key already exist");
        }

        return userRepository.save(user);
    }

    @Override
    public User getUser(String id) throws NotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("No User Found Exception"));
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return userRepository.findByEmail(email).orElseThrow(() -> new NotFoundException("No User Found Exception"));
    }

    @Override
    public void delete(String id) throws NotFoundException {
        getUser(id);
        userRepository.deleteById(id);
    }
}
