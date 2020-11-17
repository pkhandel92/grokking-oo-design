package com.splitwise.split;

import com.splitwise.user.User;

public abstract class Split {
    private User user;
    private SplitType type;
    protected double amount;

    public Split(User user,SplitType type) {
        this.user=user;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SplitType getType() {
        return type;
    }

    public void setType(SplitType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
