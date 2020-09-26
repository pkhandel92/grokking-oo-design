package com.overlow.stack.question;

import com.overlow.stack.account.Member;
import com.overlow.stack.answer.Answer;
import com.overlow.stack.question.IQuestionService;
import com.overlow.stack.question.Question;

import java.util.*;

public class QuestionService implements IQuestionService {
    private Map<Member,HashSet<Question>> questionMap=new HashMap<>();

    @Override
    public boolean addQuestion(Member member, Question question) {
       HashSet<Question>questionsByMember= questionMap.getOrDefault(member,new HashSet<>());
       questionsByMember.add(question);
         questionMap.put(member,questionsByMember);
         return true;
    }

    @Override
    public boolean removeQuestion(Member member, Question question) {
        HashSet<Question>questionsByMember= questionMap.getOrDefault(member,new HashSet<>());
        return questionsByMember.remove(question);

    }

    @Override
    public Set<Question> getQuestionsAsked(Member member) {
        return questionMap.getOrDefault(member, new HashSet<>());
    }

    @Override
    public Question getQuestion(Question question) {
        HashSet<Question> questionListByMember= questionMap.getOrDefault(question.getMember(),new HashSet<>());
        Optional<Question> optionToQuestion= questionListByMember.stream().filter(question1 ->question1.equals(question) ).findFirst();
        return optionToQuestion.get();
    }
    @Override
    public void update(Question question) {
        HashSet<Question> questions=questionMap.get(question);
        questions.add(question);
        questionMap.put(question.getMember(), questions);

    }
}
