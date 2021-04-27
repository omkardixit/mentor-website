package com.example.mentormenteewebsite.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Mentor")
public class Mentor {

    @Id
    private String email;
    private User user;
    private String description;
    private List<String> experties;

    public Mentor() {
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "email='" + email + '\'' +
                ", user=" + user +
                ", description='" + description + '\'' +
                ", experties=" + experties +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getExperties() {
        return experties;
    }

    public void setExperties(List<String> experties) {
        this.experties = experties;
    }

    public Mentor(String email, User user, String description, List<String> experties) {
        this.email = email;
        this.user = user;
        this.description = description;
        this.experties = experties;
    }
}
