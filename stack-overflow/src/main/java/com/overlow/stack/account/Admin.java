package com.overlow.stack.account;

import com.overlow.stack.question.IQuestionService;

public class Admin extends Moderator{
    private IAccountService iAccountService;

    public Admin(IQuestionService questionService) {
        super(questionService);
    }

    public IAccountService getiAccountService() {
        return iAccountService;
    }

    public void setiAccountService(IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }

    public boolean blockAccount(Member member){
        return iAccountService.blockAccount(member);
    }
    public boolean unblockAccount(Member member){
        return iAccountService.unblockAccount(member);
    }
}
