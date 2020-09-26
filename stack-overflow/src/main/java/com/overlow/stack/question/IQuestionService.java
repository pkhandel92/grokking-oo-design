package com.overlow.stack.question;

import com.overlow.stack.account.Member;
import com.overlow.stack.answer.Answer;

import java.util.Set;

public interface IQuestionService {
    public boolean addQuestion(Member member,Question question);
    public boolean removeQuestion(Member member,Question question);

    public Set<Question> getQuestionsAsked(Member member);

    public Question getQuestion(Question question);

   public void update(Question question);
}
