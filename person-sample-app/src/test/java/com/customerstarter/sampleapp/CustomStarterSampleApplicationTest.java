package com.customerstarter.sampleapp;

import com.customstarter.person.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CustomStarterSampleApplication.class)
public class CustomStarterSampleApplicationTest {
    @Autowired
    Person person;

    @Test
    public void givenString_ifString_thenSuccess(){
        String personStr = "Person(name=Jack, age=11)";
        assertEquals(personStr, person.toString());
    }
}
