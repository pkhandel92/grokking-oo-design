package com.overlow.stack.account;

public interface IAccountService {
    public boolean blockAccount(Member member);
    public boolean unblockAccount(Member member);
    public boolean login(Member member);
}
