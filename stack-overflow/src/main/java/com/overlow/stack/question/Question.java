package com.overlow.stack.question;

import com.overlow.stack.account.Member;
import com.overlow.stack.answer.Answer;
import com.overlow.stack.comment.Comment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question {
    private int questionId;
    private String title;
    private String question;
    private Tag tag;
    private Bounty bounty;
    private Member member;
    private int upVotes;
    private int downVotes;
    private List<Answer> answer;
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void upVote(){
        this.upVotes++;
    }
    public void  downVote(){
        this.downVotes++;
    }
    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
    public void addAnswer(Answer answer){
        if(this.answer==null)
            this.answer=new ArrayList<Answer>();
        this.answer.add(answer);
    }

    public String getTitle() {
        return title;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Bounty getBounty() {
        return bounty;
    }

    public void setBounty(Bounty bounty) {
        this.bounty = bounty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return getQuestionId() == question1.getQuestionId() &&
                getTitle().equals(question1.getTitle()) &&
                getQuestion().equals(question1.getQuestion()) &&
                getTag().equals(question1.getTag()) &&
                getBounty().equals(question1.getBounty()) &&
                getMember().equals(question1.getMember());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getTitle(), getQuestion(), getTag(), getBounty(), getMember());
    }
}
