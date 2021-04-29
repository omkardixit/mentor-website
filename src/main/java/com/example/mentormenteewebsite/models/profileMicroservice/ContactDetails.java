package com.example.mentormenteewebsite.models.profileMicroservice;

public class ContactDetails {
    private String phoneNumber;
    private String webSite;
    private String linkedIn;
    private String github;

    public ContactDetails() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public ContactDetails(String phoneNumber, String webSite, String linkedIn, String github) {
        this.phoneNumber = phoneNumber;
        this.webSite = webSite;
        this.linkedIn = linkedIn;
        this.github = github;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", webSite='" + webSite + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}
