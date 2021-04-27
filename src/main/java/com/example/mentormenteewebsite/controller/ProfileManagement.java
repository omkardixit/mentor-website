package com.example.mentormenteewebsite.controller;

import com.example.mentormenteewebsite.models.Mentee;
import com.example.mentormenteewebsite.models.Mentor;
import com.example.mentormenteewebsite.models.PostUserResponse;
import com.example.mentormenteewebsite.models.UserType;
import com.example.mentormenteewebsite.service.ProfileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileManagement {

    @Autowired
    ProfileManagementService profileManagementService;

    @RequestMapping(value = "/mentor", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity postMentor(@RequestBody Mentor mentor) {
        profileManagementService.insertMentor(mentor);
        String responseMessage = "Created " + UserType.Mentor + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getAllMentors() {
        List<Mentor> mentors = profileManagementService.getAllMentors();
        return ResponseEntity.ok(mentors);
    }

    @RequestMapping(value = "/mentor", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseBody
    public ResponseEntity replaceMentor(@RequestBody Mentor mentor) {
        profileManagementService.update(mentor);
        String responseMessage = "Updated " + UserType.Mentor + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentor", method = RequestMethod.PATCH, consumes = "application/json")
    @ResponseBody
    public ResponseEntity updateMentor(@RequestBody Mentor mentor) {
        profileManagementService.update(mentor);
        String responseMessage = "Updated " + UserType.Mentor + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentee", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity postMentee(@RequestBody Mentee mentee) {
        profileManagementService.insertMentee(mentee);
        String responseMessage = "Created " + UserType.Mentee + " successfully";
        PostUserResponse postUserResponse = new PostUserResponse(responseMessage);
        return ResponseEntity.ok(postUserResponse);
    }

    @RequestMapping(value = "/mentee", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getAllMentees() {
        List<Mentee> mentors = profileManagementService.getAllMentees();
        return ResponseEntity.ok(mentors);
    }
}
