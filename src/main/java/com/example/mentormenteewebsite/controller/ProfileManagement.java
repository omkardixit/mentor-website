package com.example.mentormenteewebsite.controller;

import com.example.mentormenteewebsite.models.Mentor;
import com.example.mentormenteewebsite.models.MentorRepository;
import com.example.mentormenteewebsite.models.PostUserResponse;
import com.example.mentormenteewebsite.models.UserType;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoException;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileManagement {

    @Autowired
    private MentorRepository mentorRepository;

    @RequestMapping(value = "/mentor", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity postUser(@RequestBody Mentor mentor) {
        mentorRepository.insert(mentor);
        String responseMessage = "Created " + UserType.Mentor + " successfully";

        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }
}
