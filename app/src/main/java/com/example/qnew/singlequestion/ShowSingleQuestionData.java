package com.example.qnew.singlequestion;

public class ShowSingleQuestionData {
    private String answer;
    private int imageid;
    private String name;

    public ShowSingleQuestionData(String answer, int imageid, String name) {
        this.answer = answer;
        this.imageid = imageid;
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public int getImageid() {
        return imageid;
    }

    public String getName() {
        return name;
    }
}
