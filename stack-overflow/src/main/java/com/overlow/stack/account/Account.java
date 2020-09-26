package com.overlow.stack.account;

public abstract class Account {
    private String name;
    private String address;
    private String email;
    private String userId;
    public abstract boolean resetPassword(String newPassword);
}
