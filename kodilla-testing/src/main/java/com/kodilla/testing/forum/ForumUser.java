package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public int getPostsQuantity(){
        return 100;
    }

    public int getCommentsQuantity(){
        return 100;
    }

    public void addPost(String author, String postBody) {       // [14]
        // do nothing
    }                                                           // [15]

    public void addComment(ForumPost thePost, String author, String commentBody) {   // [16]
        // do nothing
    }

    public ForumPost getPost(int postNumber){
        return null;
    }

    public ForumComment getComment(int commentNumber){
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        // return true temporarily
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

}
