package com.agriarche.kasuwabackend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorMessage> handleException(IllegalArgumentException ex){
        ErrorMessage error = new ErrorMessage();
        error.message=ex.getMessage();
        error.statusCode = HttpStatus.BAD_REQUEST.value();
        return new  ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
