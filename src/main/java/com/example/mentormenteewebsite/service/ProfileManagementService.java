package com.example.mentormenteewebsite.service;

import com.example.mentormenteewebsite.database.profileMicroservice.MenteeRepository;
import com.example.mentormenteewebsite.database.profileMicroservice.MentorRepository;
import com.example.mentormenteewebsite.models.profileMicroservice.Mentee;
import com.example.mentormenteewebsite.models.profileMicroservice.Mentor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileManagementService {
    @Autowired
    private MenteeRepository menteeRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Mentor insertMentor(Mentor mentor) {
        return mentorRepository.insert(mentor);
    }

    public Mentor update(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    // TODO
    public void patch(Mentor mentor) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(mentor.getEmail()));

        Update update = new Update();
        update.set("name", "abc");

        mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true), Mentor.class);
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentee insertMentee(Mentee mentor) {
        return menteeRepository.insert(mentor);
    }

    public List<Mentee> getAllMentees() {
        return menteeRepository.findAll();
    }
}
