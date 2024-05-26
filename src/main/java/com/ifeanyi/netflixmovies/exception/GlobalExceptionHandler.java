package com.ifeanyi.netflixmovies.exception;

import com.ifeanyi.netflixmovies.exception.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleGeneralException(Exception exception) {

        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .timestamp(new Date())
                .build();

        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> handleGeneralException(NotFoundException exception) {

        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.NOT_FOUND.value())
                .timestamp(new Date())
                .build();

        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

}
