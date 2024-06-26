package com.ifeanyi.netflixmovies.user.repository;

import com.ifeanyi.netflixmovies.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional <User> findByEmail(String email);

}
