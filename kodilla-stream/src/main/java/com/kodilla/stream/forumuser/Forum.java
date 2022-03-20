package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "name1", 'F', LocalDate.of(1991,01,01),10));
        userList.add(new ForumUser(2, "name2", 'M', LocalDate.of(1992,02,02),20));
        userList.add(new ForumUser(3, "name3", 'M', LocalDate.of(2003,03,03),30));
        userList.add(new ForumUser(3, "name4", 'M', LocalDate.of(1993,03,03),0));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
