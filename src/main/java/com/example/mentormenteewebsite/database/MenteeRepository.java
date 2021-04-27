package com.example.mentormenteewebsite.database;

import com.example.mentormenteewebsite.models.Mentee;
import com.example.mentormenteewebsite.models.Mentor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MenteeRepository extends MongoRepository<Mentee, String> {
    List<Mentee> findAll();
    Mentee save(Mentee mentee);
    Mentee insert(Mentee mentee);
}
