package com.example.mentormenteewebsite.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Mentor")
public class Mentor {

    private User user;
    private String description;
    private Experties experties;

    public Mentor() {
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

    public Experties getExperties() {
        return experties;
    }

    public void setExperties(Experties experties) {
        this.experties = experties;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "user=" + user +
                ", description='" + description + '\'' +
                ", experties=" + experties +
                '}';
    }
}
