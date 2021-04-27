package com.example.mentormenteewebsite.database;

import com.example.mentormenteewebsite.models.ProfilePhoto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfilePictureRepository extends MongoRepository<ProfilePhoto, String> {
    ProfilePhoto save(ProfilePhoto photo);

}
