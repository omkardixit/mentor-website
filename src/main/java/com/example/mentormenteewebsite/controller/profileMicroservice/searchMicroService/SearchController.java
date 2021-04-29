package com.example.mentormenteewebsite.controller.profileMicroservice.searchMicroService;

import com.example.mentormenteewebsite.models.profileMicroservice.Mentor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @RequestMapping(value = "/mentor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity searchMentors() {
        return ResponseEntity.ok("Details");
    }
}
