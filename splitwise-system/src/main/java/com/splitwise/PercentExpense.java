package com.splitwise;

import com.splitwise.split.PercentSplit;
import com.splitwise.split.Split;
import com.splitwise.user.User;

import java.util.List;

public class PercentExpense extends Expense{

    public PercentExpense(List<Split> splits, User paidBy, double amount) {
        super(splits, paidBy, amount);
    }

    @Override
    public boolean validate() {
        double totalPercent=100;
        double currentPercent=0;
        for (Split split:getSplits()){
            if (!(split instanceof PercentSplit))
                return false;
            PercentSplit percentSplit=(PercentSplit)split;
            currentPercent+=percentSplit.getPercent();
        }
        return currentPercent==totalPercent;
    }
}
