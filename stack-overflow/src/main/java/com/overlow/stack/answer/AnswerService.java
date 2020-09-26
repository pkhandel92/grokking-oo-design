package com.overlow.stack.answer;

import com.overlow.stack.account.Member;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnswerService implements IAnswerService{
    Map<Member,Set<Answer>> answerMap=new HashMap<>();

    @Override
    public Set<Answer> getAnswers(Member member) {
        Set<Answer> answers=answerMap.getOrDefault(member, Collections.emptySet());
        return answers;
    }

    @Override
    public boolean addAnswer(Answer answer) {
        Set<Answer> answersByMember=answerMap.getOrDefault(answer.getMember(),Collections.emptySet());
        answersByMember.add(answer);
        return !answerMap.put(answer.getMember(),answersByMember).isEmpty();
    }
}
