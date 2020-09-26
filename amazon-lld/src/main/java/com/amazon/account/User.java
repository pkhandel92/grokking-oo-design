package com.amazon.account;

public class User implements IAccount{
    private String name;
    private String address;
    private String id;
    private String emailId;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAccountId() {
        return id;
    }

    @Override
    public String getEmailId() {
        return emailId;
    }
}
