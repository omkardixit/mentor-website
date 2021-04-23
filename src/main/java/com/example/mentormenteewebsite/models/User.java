package com.example.mentormenteewebsite.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    private String name;

    private ContactDetails contactDetails;

    public User(String name,ContactDetails contactDetails) {
        this.name = name;
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
                ", contactDetails=" + contactDetails +
                '}';
    }
}
