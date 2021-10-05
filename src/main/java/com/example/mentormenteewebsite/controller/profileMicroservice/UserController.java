package com.example.mentormenteewebsite.controller.profileMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.User;
import com.example.mentormenteewebsite.database.profileMicroservice.UserRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepositiory userRepositiory;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllTutorials() {
        List<User> users =userRepositiory.findAll();

        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public void postUsers() {

    }


}
