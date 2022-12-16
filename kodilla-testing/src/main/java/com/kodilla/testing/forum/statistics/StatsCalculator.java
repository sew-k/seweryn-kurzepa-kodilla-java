package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

public class StatsCalculator {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averageUserPostsQuantity;
    private double averageUserCommentsQuantity;
    private double averageCommentsOnPostQuantity;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageUserPostsQuantity() {
        return averageUserPostsQuantity;
    }

    public double getAverageUserCommentsQuantity() {
        return averageUserCommentsQuantity;
    }

    public double getAverageCommentsOnPostQuantity() {
        return averageCommentsOnPostQuantity;
    }

    private Statistics statistics;

    public StatsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public boolean possibilityOfStatsCalculation() {
        if ((statistics.userNames().size() == 0) || (statistics.postsCount() == 0 && statistics.commentsCount() != 0 )) {
            return false;
        } else {
            return true;
        }

    }

    public double averageUserPostsQuantityCalc() {
        double result = (double)statistics.postsCount() / statistics.userNames().size();
        return result;
    }

    public double averageUserCommentsQuantityCalc() {
        double result = (double)statistics.commentsCount() / statistics.userNames().size();
        return result;
    }

    public double averageCommentsOnPostQuantityCalc() {
        double result = (double)statistics.commentsCount() / statistics.postsCount();
        return result;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.usersQuantity = statistics.userNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        this.averageUserPostsQuantity = averageUserPostsQuantityCalc();
        this.averageUserCommentsQuantity = averageUserCommentsQuantityCalc();
        this.averageCommentsOnPostQuantity = averageCommentsOnPostQuantityCalc();

        showStatistics();
    }

    public void showStatistics() {
        System.out.println("Showing some statistics...");
        System.out.println("There is " + this.usersQuantity + " users signed up to the forum");
        System.out.println("And total " + this.postsQuantity + " posts.");
        System.out.println("Also, the total number of comments is " + this.commentsQuantity + ".");
        System.out.println("In average, every user wrote " + this.averageUserPostsQuantity + " posts, ");
        System.out.println("and gave " + this.averageUserCommentsQuantity + " comments.");
        System.out.println("Every post have " + this.averageCommentsOnPostQuantity + " comments in average.");
    }
}
