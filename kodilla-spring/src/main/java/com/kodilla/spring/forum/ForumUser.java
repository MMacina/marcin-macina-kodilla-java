package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User{
//    final String username;
//
//    public ForumUser(String username) {
//        this.username = "John Smith";
//    }

    @Override
    public String getUserName() {
        return "John Smith";
    }
}
