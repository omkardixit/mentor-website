package com.example.mentormenteewebsite.database.profileMicroservice;

import com.example.mentormenteewebsite.models.profileMicroservice.ProfilePhoto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfilePictureRepository extends MongoRepository<ProfilePhoto, String> {
    ProfilePhoto save(ProfilePhoto photo);

}
