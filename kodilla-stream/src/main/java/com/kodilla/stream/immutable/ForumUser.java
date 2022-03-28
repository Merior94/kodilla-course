package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;
    private int age;

    public ForumUser(final String username, final String realName, int age) {
        this.username = username;
        this.realName = realName;
        age = 100;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
