package com.example.mentormenteewebsite.models.profileMicroservice;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    private String name;

    private ContactDetails contactDetails;

    private ProfilePhoto profilePhoto;

    public User() {
    }

    public User(String name, ContactDetails contactDetails, ProfilePhoto profilePhoto) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.profilePhoto = profilePhoto;
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

    public ProfilePhoto getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(ProfilePhoto profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
