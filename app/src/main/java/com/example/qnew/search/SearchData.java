package com.example.qnew.search;

public class SearchData {
   private String  nameid;
   private int imageid;

    public SearchData(String nameid, int imageid) {
        this.nameid = nameid;
        this.imageid = imageid;
    }

    public String getNameid() {
        return nameid;
    }

    public int getImageid() {
        return imageid;
    }
}
