package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(1,"Alberto", 'M', LocalDate.of(2000, 1,22), 15));
        theUsersList.add(new ForumUser(2,"Agnieszka", 'F', LocalDate.of(1980, 2,12), 15));
        theUsersList.add(new ForumUser(3,"Stefanie", 'F',  LocalDate.of(1977, 3,30), 15));
        theUsersList.add(new ForumUser(4,"John", 'M', LocalDate.of(2012, 4,24), 15));
        theUsersList.add(new ForumUser(5,"Kunegunda", 'F', LocalDate.of(1999, 5,11) , 15));
        theUsersList.add(new ForumUser(6,"Patricio", 'M', LocalDate.of(1990, 6,5), 15));
        theUsersList.add(new ForumUser(7,"Bambino", 'M', LocalDate.of(1952, 7,5), 15));
        theUsersList.add(new ForumUser(8,"Andzelika", 'F', LocalDate.of(1994, 1,12), 15));
        theUsersList.add(new ForumUser(9,"Zosia", 'F', LocalDate.of(1966, 1,23), 15));
        theUsersList.add(new ForumUser(10,"Krucjatusz", 'M', LocalDate.of(2015, 11,22), 15));
        theUsersList.add(new ForumUser(11,"Pompejusz", 'M', LocalDate.of(2005, 11,12), 15));
        theUsersList.add(new ForumUser(12,"Alehambra", 'F', LocalDate.of(2002, 12,27), 15));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(theUsersList);
    }
}
