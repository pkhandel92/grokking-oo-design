package com.splitwise;

import com.splitwise.split.PercentSplit;
import com.splitwise.split.Split;
import com.splitwise.split.SplitType;
import com.splitwise.user.User;

import java.util.List;

public class ExpenseFactory {
    public static Expense createExpense(List<Split>splits, double amount, SplitType type, User paidBy){
        switch (type){
            case EQUAL:
                int splitSize=splits.size();
                for (Split split:splits){
                    split.setAmount(split.getAmount()/splitSize);
                }
                return new EqualExpense(splits,paidBy,amount);

            case EXACT:
                return new ExactExpense(splits,paidBy,amount);
            case PERCENT:
                for (Split split:splits){
                    PercentSplit percentSplit=(PercentSplit)split;
                    split.setAmount(percentSplit.getPercent()*amount/100);
                }
                return new PercentExpense(splits, paidBy, amount);
            default:
                return null;
        }
    }
}
