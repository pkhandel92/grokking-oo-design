package com.splitwise;

import com.splitwise.split.Split;
import com.splitwise.user.User;

import java.util.List;

public abstract class Expense {
    private List<Split> splits;
    private User paidBy;
    private double amount;

    public Expense(List<Split> splits, User paidBy, double amount) {
        this.splits = splits;
        this.paidBy = paidBy;
        this.amount = amount;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract boolean validate();
}
