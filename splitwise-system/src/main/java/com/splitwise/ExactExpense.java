package com.splitwise;

import com.splitwise.split.EqualSplit;
import com.splitwise.split.ExactSplit;
import com.splitwise.split.Split;
import com.splitwise.user.User;

import java.util.List;

public class ExactExpense extends Expense{
    public ExactExpense(List<Split> splits, User paidBy, double amount) {
        super(splits, paidBy, amount);
    }

    @Override
    public boolean validate() {
        double totalAmount=0;
        for (Split split:getSplits()){
            if(!(split instanceof ExactSplit))
                return false;
            totalAmount+=split.getAmount();

        }
        return totalAmount==getAmount();
    }
}
