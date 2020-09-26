package com.overlow.stack.answer;

import com.overlow.stack.account.Member;
import com.overlow.stack.comment.Comment;
import com.overlow.stack.question.Question;

import java.util.List;
import java.util.Objects;

public class Answer {
    private Question question;
    private int upVotes;
    private int downVotes;
    private String explanation;
    private Member member;
    private boolean isAccepted;
    private List<Comment> comments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return isAccepted() == answer.isAccepted() &&
                getQuestion().equals(answer.getQuestion()) &&
                getExplanation().equals(answer.getExplanation()) &&
                getMember().equals(answer.getMember());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestion(), getExplanation(), getMember(), isAccepted());
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
