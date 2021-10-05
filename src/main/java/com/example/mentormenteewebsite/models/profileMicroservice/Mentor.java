package com.example.mentormenteewebsite.models.profileMicroservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@JsonSerialize
@Document(collection = "Mentor")
public class Mentor {

    @Id
    private String email;
    private User user;
    private String description;
    private Experties experties;

    public Mentor() {
    }

    public Mentor(String email, User user, String description, Experties experties) {
        this.email = email;
        this.user = user;
        this.description = description;
        this.experties = experties;
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

    public Experties getExperties() {
        return experties;
    }

    public void setExperties(Experties experties) {
        this.experties = experties;
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
}
