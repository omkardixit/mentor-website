package com.example.mentormenteewebsite.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.List;

public class Experties {
    private List<String> experties;

    public Experties() {
    }

    public Experties(List<String> experties) {
        this.experties = experties;
    }

    @Override
    public String toString() {
        return "Experties{" +
                "experties=" + experties +
                '}';
    }

    public List<String> getExperties() {
        return experties;
    }

    public void setExperties(List<String> experties) {
        this.experties = experties;
    }
}
