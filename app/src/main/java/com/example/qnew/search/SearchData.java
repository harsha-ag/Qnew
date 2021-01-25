package com.example.qnew.search;

public class SearchData {
   private String profileName;
   private String profilePicture;

    public SearchData(String profileName, String profilePicture) {
        this.profileName = profileName;
        this.profilePicture = profilePicture;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }
}
