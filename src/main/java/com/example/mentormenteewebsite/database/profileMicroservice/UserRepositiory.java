package com.example.mentormenteewebsite.database.profileMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepositiory extends MongoRepository<User, String> {
    List<User> findAll();
    User save(User user);
}
