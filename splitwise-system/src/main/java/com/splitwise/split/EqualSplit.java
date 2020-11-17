package com.splitwise.split;

import com.splitwise.user.User;

public class EqualSplit extends Split
{
    public EqualSplit(User user, SplitType type) {
        super(user,SplitType.EQUAL);
    }
}
