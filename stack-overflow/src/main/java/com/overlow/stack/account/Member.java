package com.overlow.stack.account;

import com.overlow.stack.answer.Answer;
import com.overlow.stack.answer.IAnswerService;
import com.overlow.stack.badge.Badge;
import com.overlow.stack.comment.Comment;
import com.overlow.stack.question.Bounty;
import com.overlow.stack.question.IQuestionService;
import com.overlow.stack.question.Question;

import java.util.List;
import java.util.Set;

public  class Member extends Account{
    private Set<Question> questionsList;
    private List<Comment> commentList;
    private List<Badge> badgesList;
    private Set<Answer> answerList;
    private int reputation;
    private IQuestionService questionService;
    private IAnswerService answerService;
    private Bounty bounty;
    @Override
    public boolean resetPassword(String newPassword) {

        return false;
    }
    public boolean addQuestion(Question question){
        questionService.addQuestion(this,question);
        questionService.getQuestionsAsked(this);
        return questionsList.add(question);
    }
    public void upVote(Question question){
        question.upVote();
        questionService.update(question);
    }
    public void downVote(Question question){
        question.downVote();
        questionService.update(question);
    }

    public void addBounty(Bounty bounty){
        if(this.getReputation()>bounty.getReputation()){
            this.setBounty(bounty);
        }
    }
    public void addAnswer(Answer answer){
        //Add it to answer service
        answerService.addAnswer(answer);
        //Update question
        Question question=answer.getQuestion();
        question.addAnswer(answer);
        questionService.update(question);
    }
    public void setQuestionsList(Set<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public Set<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(Set<Answer> answerList) {
        this.answerList = answerList;
    }

    public IAnswerService getAnswerService() {
        return answerService;
    }

    public void setAnswerService(IAnswerService answerService) {
        this.answerService = answerService;
    }

    public Bounty getBounty() {
        return bounty;
    }

    public void setBounty(Bounty bounty) {
        this.bounty = bounty;
    }


    public IQuestionService getQuestionService() {
        return questionService;
    }

    public void setQuestionService(IQuestionService questionService) {
        this.questionService = questionService;
    }

    public Set<Question> getQuestionsList() {
        this.questionsList=questionService.getQuestionsAsked(this);
        return questionsList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Badge> getBadgesList() {
        return badgesList;
    }

    public void setBadgesList(List<Badge> badgesList) {
        this.badgesList = badgesList;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
}
