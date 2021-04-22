package com.example.mentormenteewebsite.controller;

import com.example.mentormenteewebsite.models.Mentor;
import com.example.mentormenteewebsite.models.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileManagement {

    @Autowired
    private MentorRepository mentorRepository;

    @PostMapping("/mentor")
    public ResponseEntity<String> postUser(@RequestBody Mentor mentor) {
        mentorRepository.save(mentor);
        return ResponseEntity.ok("Created Mentor Successfully");
    }
}
