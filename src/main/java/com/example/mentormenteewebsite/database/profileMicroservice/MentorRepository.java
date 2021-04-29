package com.example.mentormenteewebsite.database.profileMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.Mentor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MentorRepository extends MongoRepository<Mentor,String> {
    List<Mentor> findAll();
    Mentor save(Mentor mentor);
    Mentor insert(Mentor mentor);
}
