package com.example.qnew.feedpost;

public class PostData {
    private String nameQid;
    private String imageQid;
    private String question;
    private String answer;
    private int lcount;
    private int dcount;
    private String category;
    private int reactionType;

    public void setReactionType(int reactionType) {
        this.reactionType = reactionType;
    }

    public PostData(String nameQid, String imageQid, String question, String answer, int lcount, int dcount, String category, int reactionType) {
        this.nameQid = nameQid;
        this.imageQid = imageQid;
        this.question = question;
        this.answer = answer;
        this.lcount = lcount;
        this.dcount = dcount;
        this.category = category;
        this.reactionType = reactionType;
    }

    public int getReactionType() {
        return reactionType;
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

    public String getCategory() {
        return category;
    }
}
