package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;

    public int getNumberOfUsers() { return numberOfUsers; }
    public int getNumberOfPosts() { return numberOfPosts; }
    public int getNumberOfComments() { return numberOfComments; }
    public double getPostPerUser() { return postPerUser; }
    public double getCommentPerUser() { return commentPerUser; }
    public double getCommentPerPost() { return commentPerPost; }

    public void calculateAdvStatistics(Statistics statistics) {
       double numberOfUsers = statistics.usersNames().size();
        double numberOfPosts = statistics.postsCount();
        double numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0 && numberOfPosts >0) {
            if (numberOfComments >= 0) {
                commentPerPost = numberOfComments / numberOfPosts;
                commentPerUser = numberOfComments / numberOfUsers;
            } else {
                double commentPerPost = 0;
                double commentPerUser = 0;
            }
            postPerUser = numberOfPosts / numberOfUsers;
        } else {
            double postPerUser = 0;
        }
    }
}
