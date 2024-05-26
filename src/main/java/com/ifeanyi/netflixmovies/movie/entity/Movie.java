package com.ifeanyi.netflixmovies.movie.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movies")
@Data
public class Movie {

    @Id
    private String id;
    private String movieUrl;
    private String name;
    private String contentType;
    private String description;
    private String contentRating;
    private String genre;
    private String poster;
    private String formattedDuration;
    private String releasedDate;
    private String actors;
    private String director;
    private String creator;
    private String audio;
    private String subtitle;
    private String availableForOffline;
    private String numberOfSeasons;
    private String seasonStartDate;
    private String source;
    private String sourceLink;
    private String uniqId;
    private String scrapedAt;
}
