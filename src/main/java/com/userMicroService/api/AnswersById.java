package com.userMicroService.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnswersById {

    private int id;
    @JsonProperty("question_id")
    private int questionId;
    @JsonProperty("answer_option")
    private String answerOption;
    @JsonProperty("user_id")
    private int userId;

    public AnswersById(int id, int questionId, String answerOption, int userId) {
        this.id = id;
        this.questionId = questionId;
        this.answerOption = answerOption;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
