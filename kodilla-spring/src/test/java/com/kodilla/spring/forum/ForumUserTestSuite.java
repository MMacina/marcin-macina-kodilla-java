package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUserName() {
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        User user = context.getBean(ForumUser.class);

        //When
        String name = user.getUserName();

        //Then
        assertEquals("John Smith", name);
    }
}
