package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(final int identifier, final String userName, final char sex, final LocalDate dateOfBirth, final int postsQuantity) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return " User nr: " + identifier +
                ", Name: " + userName +
                ", sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", post quantity: " + postsQuantity;
    }
}
