package com.example.qnew.feedpost;

public class postdata {
    private String nameQid;
    private int imageQid;
    private String question;
    private String answer;
    private  int lcount;
    private int dcount;

    public postdata(String nameQid, int imageQid, String question, String answer, int lcount, int dcount) {
        this.nameQid = nameQid;
        this.imageQid = imageQid;
        this.question = question;
        this.answer = answer;
        this.lcount = lcount;
        this.dcount = dcount;
    }

    public String getNameQid() {
        return nameQid;
    }

    public int getImageQid() {
        return imageQid;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getLcount() {
        return lcount;
    }

    public int getDcount() {
        return dcount;
    }
}
