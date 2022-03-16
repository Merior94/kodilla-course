package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userCount;
    private int postsCount;
    private int commentCount;
    private double meanPostsPerUser;
    private double meanCommentsPerUser;
    private double meanCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.userCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentCount = statistics.commentsCount();

        if(userCount != 0){
            meanPostsPerUser = (double) this.postsCount/this.userCount;
            meanCommentsPerUser = (double) this.commentCount/this.userCount;
        }

        if(postsCount != 0){
            meanCommentsPerPost = (double) this.commentCount/this.postsCount;
        }
    }

    public void showStatistics(){
        System.out.println("userCount: " + this.userCount);
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getMeanPostsPerUser() {
        return meanPostsPerUser;
    }

    public void setMeanPostsPerUser(double meanPostsPerUser) {
        this.meanPostsPerUser = meanPostsPerUser;
    }

    public double getMeanCommentsPerUser() {
        return meanCommentsPerUser;
    }

    public void setMeanCommentsPerUser(double meanCommentsPerUser) {
        this.meanCommentsPerUser = meanCommentsPerUser;
    }

    public double getMeanCommentsPerPost() {
        return meanCommentsPerPost;
    }

    public void setMeanCommentsPerPost(double meanCommentsPerPost) {
        this.meanCommentsPerPost = meanCommentsPerPost;
    }
}
