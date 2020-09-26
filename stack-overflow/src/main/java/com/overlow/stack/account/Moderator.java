package com.overlow.stack.account;

import com.overlow.stack.question.IQuestionService;
import com.overlow.stack.question.Question;

public class Moderator extends Member{
    private IQuestionService questionService;

    public Moderator(IQuestionService questionService) {
        this.questionService = questionService;
    }

    public boolean delete(Question question){
        return questionService.removeQuestion(this,question);
    }

}
