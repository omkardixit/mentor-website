package com.example.mentormenteewebsite.models.profileMicroservice;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profilePhoto")
public class ProfilePhoto {
    @Id
    private String id;

    private String title;

    private String image;

    @Override
    public String toString() {
        return "ProfilePhoto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProfilePhoto(String id, String title, String image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public ProfilePhoto() {
    }
}
