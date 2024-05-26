package com.ifeanyi.netflixmovies.exception.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ErrorMessage {

    private String message;
    private Integer statusCode;
    private Date timestamp;

}
