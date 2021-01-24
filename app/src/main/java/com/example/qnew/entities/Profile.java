package com.example.qnew.entities;

public class Profile {

    private String userID;
    private String name;
    private String profilePictureURL;
    private int followerCount;
    private int followingCount;
    private String bio;

    public Profile(String userID, String name, String profilePictureURL, int followerCount, int followingCount, String bio) {
        this.userID = userID;
        this.name = name;
        this.profilePictureURL = profilePictureURL;
        this.followerCount = followerCount;
        this.followingCount = followingCount;
        this.bio = bio;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public String getBio() {
        return bio;
    }
}
