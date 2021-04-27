package com.example.mentormenteewebsite.service;

import com.example.mentormenteewebsite.database.MenteeRepository;
import com.example.mentormenteewebsite.database.MentorRepository;
import com.example.mentormenteewebsite.models.Mentee;
import com.example.mentormenteewebsite.models.Mentor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileManagementService {
    @Autowired
    private MenteeRepository menteeRepository;

    @Autowired
    private MentorRepository mentorRepository;

    public Mentor insertMentor(Mentor mentor) {
        return mentorRepository.insert(mentor);
    }

    public Mentor update(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public Mentor patch(Mentor mentor) {
        return mentorRepository.update(mentor);
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
