package com.example.mentormenteewebsite.database.profileMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.Mentee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MenteeRepository extends MongoRepository<Mentee, String> {
    List<Mentee> findAll();
    Mentee save(Mentee mentee);
    Mentee insert(Mentee mentee);
}
