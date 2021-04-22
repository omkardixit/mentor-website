package com.example.mentormenteewebsite.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    private String name;

    @Id
    private String email;
    private ContactDetails contactDetails;

    public User(String name, String email, ContactDetails contactDetails) {
        this.name = name;
        this.email = email;
        this.contactDetails = contactDetails;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
