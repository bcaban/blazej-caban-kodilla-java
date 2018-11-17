package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    int usersNumbers;
    int postsNumbers;
    int commentsNumbers;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersNumber() {
        return usersNumbers;
    }

    public int getPostNumbers() {
        return postsNumbers;
    }

    public int getCommentsNumbers() {
        return commentsNumbers;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumbers = statistics.usersNames().size();
        postsNumbers = statistics.postsCount();
        commentsNumbers = statistics.commentsCount();
        if (usersNumbers > 0) {
            averageNumberOfPostsPerUser = (double) postsNumbers / (double) usersNumbers;
            averageNumberOfCommentsPerUser = (double) commentsNumbers / (double) usersNumbers;

        }

        if (postsNumbers > 0) {
            averageNumberOfCommentsPerPost = (double) commentsNumbers / (double) postsNumbers;
        }
    }
}
