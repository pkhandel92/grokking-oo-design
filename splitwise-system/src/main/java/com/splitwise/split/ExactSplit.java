package com.splitwise.split;

import com.splitwise.user.User;

public class ExactSplit extends Split{

    public ExactSplit(User user,SplitType type, double amount) {
        super(user,SplitType.EXACT);
        this.amount=amount;
    }
}
