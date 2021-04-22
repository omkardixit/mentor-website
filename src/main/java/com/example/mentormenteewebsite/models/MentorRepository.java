package com.example.mentormenteewebsite.models;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MentorRepository extends MongoRepository<Mentor,String> {
    List<Mentor> findAll();
    Mentor save(Mentor mentor);
}
