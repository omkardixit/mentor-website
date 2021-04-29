package com.example.mentormenteewebsite.models.profileMicroservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Document(collection = "experties")
public class Experties {
    private List<String> experties;

    public Experties() {
    }

    public Experties(List<String> experties) {
        this.experties = experties;
    }

    public List<String> getExperties() {
        return experties;
    }

    public void setExperties(List<String> experties) {
        this.experties = experties;
    }

    @Override
    public String toString() {
        return "Experties{" +
                "experties=" + experties +
                '}';
    }
}
