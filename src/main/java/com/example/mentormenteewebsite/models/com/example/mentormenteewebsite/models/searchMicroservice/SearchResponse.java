package com.example.mentormenteewebsite.models.com.example.mentormenteewebsite.models.searchMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.Mentor;

import java.util.List;

public class SearchResponse {

    private List<Mentor> mentors;

    public SearchResponse() {
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "mentors=" + mentors +
                '}';
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    public SearchResponse(List<Mentor> mentors) {
        this.mentors = mentors;
    }
}
