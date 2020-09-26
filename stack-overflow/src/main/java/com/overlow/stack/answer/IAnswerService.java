package com.overlow.stack.answer;

import com.overlow.stack.account.Member;

import java.util.Set;

public interface IAnswerService {
    public Set<Answer> getAnswers(Member member);
    public boolean addAnswer(Answer answer);
}
