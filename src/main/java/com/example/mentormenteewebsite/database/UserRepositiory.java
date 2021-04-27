package com.example.mentormenteewebsite.database;

import com.example.mentormenteewebsite.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepositiory extends MongoRepository<User, String> {
    List<User> findAll();
    User save(User user);
}
