package com.example.mentormenteewebsite.controller;

import com.example.mentormenteewebsite.models.User;
import com.example.mentormenteewebsite.models.UserRepositiory;
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
        User user = new User("omkar","dixit","abc");
        userRepositiory.save(user);

    }


}
