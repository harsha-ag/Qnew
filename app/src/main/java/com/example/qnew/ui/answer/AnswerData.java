package com.example.qnew.ui.answer;

public class AnswerData {
    private String imageqr;
    private String nameqr;
    private String categoryqr;
    private String questionqr;

    public AnswerData(String imageqr, String nameqr, String categoryqr, String questionqr) {
        this.imageqr = imageqr;
        this.nameqr = nameqr;
        this.categoryqr = categoryqr;
        this.questionqr = questionqr;
    }

    public String getImageqr() {
        return imageqr;
    }

    public String getNameqr() {
        return nameqr;
    }

    public String getCategoryqr() {
        return categoryqr;
    }

    public String getQuestionqr() {
        return questionqr;
    }
}
