package com.example.mentormenteewebsite.controller.profileMicroservice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.mentormenteewebsite.models.profileMicroservice.Mentee;
import com.example.mentormenteewebsite.models.profileMicroservice.Mentor;
import com.example.mentormenteewebsite.models.profileMicroservice.PostUserResponse;
import com.example.mentormenteewebsite.models.profileMicroservice.UserType;
import com.example.mentormenteewebsite.service.ProfileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileManagement {

    private static final Logger logger = LogManager.getLogger(ProfileManagement.class);

    @Autowired
    ProfileManagementService profileManagementService;

    @RequestMapping(value = "/mentor", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity postMentor(@RequestBody Mentor mentor) {
        profileManagementService.insertMentor(mentor);
        String responseMessage = "Created " + UserType.Mentor + " successfully";
        logger.info(responseMessage);
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
        profileManagementService.patch(mentor);
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
