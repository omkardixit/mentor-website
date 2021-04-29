package com.example.mentormenteewebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class MentorMenteeWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorMenteeWebsiteApplication.class, args);
	}

}
