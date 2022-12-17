package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int userId;
    private final String username;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private int postCount;

    public ForumUser(int userId, String username, char userSex, LocalDate userBirthDate, int postCount) {
        this.userId = userId;
        this.username = username;
        this.userSex = userSex;
        this.dateOfBirth = userBirthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateUserAge() {
        int age = LocalDate.now().getYear() - getDateOfBirth().getYear();
        return age;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, userSex, dateOfBirth, postCount);
    }

    @Override
    public String toString() {
        return " ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
