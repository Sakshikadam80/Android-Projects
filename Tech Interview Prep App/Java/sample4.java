package com.example.splashscreenformajorproject;

public class sample4 {

    private String question, answer;

    private boolean expandable;
    public sample4(String question,String answer){
        this.question=question;
        this.answer=answer;
        this.expandable=false;
    }


    public boolean isExpandable(){
        return expandable;
    }
    public void setExpandable(boolean expandable){
        this.expandable = expandable;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public  String toString(){
        return "Samples{" +
                "question'" + question +'\'' +
                ", answer'" + answer + '\'' +
                '}';
    }
}
