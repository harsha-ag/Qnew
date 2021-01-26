package com.example.qnew.singlequestion;

public class ShowSingleQuestionData {
    private String answer;
    private String imageid;
    private String name;

    public ShowSingleQuestionData(String answer, String imageid, String name) {
        this.answer = answer;
        this.imageid = imageid;
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public String getImageid() {
        return imageid;
    }

    public String getName() {
        return name;
    }
}
