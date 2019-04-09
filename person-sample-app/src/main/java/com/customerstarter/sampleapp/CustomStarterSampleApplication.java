package com.customerstarter.sampleapp;

import com.customstarter.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomStarterSampleApplication {
    @Autowired
    Person person;

    public static void main(String[] args) {
        SpringApplication.run(CustomStarterSampleApplication.class, args);
    }
}
