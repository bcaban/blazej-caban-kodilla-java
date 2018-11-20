package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId, String userName, final char userSex, final LocalDate birthDate, final int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
