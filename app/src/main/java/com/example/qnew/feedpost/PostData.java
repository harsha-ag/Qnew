package com.example.qnew.feedpost;

public class PostData {
    private String nameQid;
    private String imageQid;
    private String question;
    private String answer;
    private int lcount;
    private int dcount;

    public PostData(String nameQid, String imageQid, String question, String answer, int lcount, int dcount) {
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

    public String getImageQid() {
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
