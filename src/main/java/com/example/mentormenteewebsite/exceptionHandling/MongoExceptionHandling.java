package com.example.mentormenteewebsite.exceptionHandling;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class MongoExceptionHandling extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DuplicateKeyException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundException(DuplicateKeyException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), "Document already exists",
                request.getDescription(false),HttpStatus.CONFLICT.getReasonPhrase());
        return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.CONFLICT);
    }
}
