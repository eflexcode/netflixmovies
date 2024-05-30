package com.ifeanyi.netflixmovies.user.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Users")
@Data
public class User {

    private String id;
    private String email;
    private String username;
    private String profileImageUrl;
    private List<String> interest = new ArrayList<>();
    private List<String> bookmarks = new ArrayList<>();

}
