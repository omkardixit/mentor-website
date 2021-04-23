package com.example.mentormenteewebsite.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.List;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
public class Experties {
    private String[] experties;

    public Experties() {
    }

    @Override
    public String toString() {
        return "Experties{" +
                "experties=" + Arrays.toString(experties) +
                '}';
    }

    public String[] getExperties() {
        return experties;
    }

    public void setExperties(String[] experties) {
        this.experties = experties;
    }

    public Experties(String[] experties) {
        this.experties = experties;
    }
}
