package com.overlow.stack.account;

import java.util.HashSet;
import java.util.Set;

public class AccountService implements IAccountService{
    private Set<Member> userSet=new HashSet<Member>();
    private Set<Member> blockedUser=new HashSet<Member>();
    @Override
    public boolean blockAccount(Member member) {
        return blockedUser.add(member);
    }

    @Override
    public boolean unblockAccount(Member member) {
        return blockedUser.remove(member);
    }

    @Override
    public boolean login(Member member) {
        return userSet.contains(member);
    }
}
