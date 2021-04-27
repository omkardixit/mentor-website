package com.example.mentormenteewebsite.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Mentee")
public class Mentee {
    @Id
    private String email;
    private User user;
    private String description;
    private List<String> interests;


    @Override
    public String toString() {
        return "Mentee{" +
                "email='" + email + '\'' +
                ", user=" + user +
                ", description='" + description + '\'' +
                ", interests=" + interests +
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Mentee(String email, User user, String description, List<String> interests) {
        this.email = email;
        this.user = user;
        this.description = description;
        this.interests = interests;
    }

    public Mentee() {
    }
}
