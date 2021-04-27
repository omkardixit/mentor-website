package com.example.mentormenteewebsite.controller;

import com.example.mentormenteewebsite.database.MenteeRepository;
import com.example.mentormenteewebsite.models.Mentee;
import com.example.mentormenteewebsite.models.Mentor;
import com.example.mentormenteewebsite.database.MentorRepository;
import com.example.mentormenteewebsite.models.PostUserResponse;
import com.example.mentormenteewebsite.models.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileManagement {

    @Autowired
    private MenteeRepository menteeRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @RequestMapping(value = "/mentor", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity postMentor(@RequestBody Mentor mentor) {
        mentorRepository.insert(mentor);
        String responseMessage = "Created " + UserType.Mentor + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getAllMentors() {
        List<Mentor> mentors = mentorRepository.findAll();
        return ResponseEntity.ok(mentors);
    }

    @RequestMapping(value = "/mentee", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity postMentee(@RequestBody Mentee mentee) {
        menteeRepository.insert(mentee);
        String responseMessage = "Created " + UserType.Mentee + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentee", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getAllMentees() {
        List<Mentee> mentors = menteeRepository.findAll();
        return ResponseEntity.ok(mentors);
    }
}
