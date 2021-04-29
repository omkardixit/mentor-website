package com.example.mentormenteewebsite.models.profileMicroservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class PostUserResponse {
    private String message;

    public PostUserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PostUserResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    public PostUserResponse() {
    }
}
