package com.splitwise;

import com.splitwise.split.Split;
import com.splitwise.split.SplitType;
import com.splitwise.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseManager {
    private List<Expense> expenses;
    private Map<String,User> userMap;
    private Map<String,Map<String,Double>> balanceSheet;

    public void addExpense(SplitType splitType, List<Split> splitList, User paidBy, double amount){
        Expense expense = ExpenseFactory
                .createExpense(splitList,amount,splitType,paidBy);
        expenses.add(expense);
        for (Split split : expense.getSplits()) {
            String paidTo = split.getUser().getUserId();
            Map<String, Double> balances = balanceSheet.get(paidBy);
            if (!balances.containsKey(paidTo)) {
                balances.put(paidTo, 0.0);
            }
            balances.put(paidTo, balances.get(paidTo) + split.getAmount());

            balances = balanceSheet.get(paidTo);
            if (!balances.containsKey(paidBy)) {
                balances.put(paidBy.getUserId(), 0.0);
            }
            balances.put(paidBy.getUserId(), balances.get(paidBy) - split.getAmount());
        }
    }
    public void addUser(User user){
        if(!userMap.containsKey(user.getUserId())){
            userMap.put(user.getUserId(),user);
            balanceSheet.put(user.getUserId(),new HashMap<String, Double>());
        }
    }
    public void showBalance(User user){
        String userId=user.getUserId();
        Map<String,Double> balances=balanceSheet.get(userId);
        for (String userId2:balanceSheet.keySet()){
            printBalance(user,userMap.get(userId2),balances.get(userId2));
        }
    }

    private void printBalance(User userId, User userId2,  Double amount) {
        if(amount<0)
            System.out.println(userId.getFullName()+" owes "+userId2.getFullName()+" amount "+amount);
        else
            System.out.println(userId2.getFullName()+" owes "+userId.getFullName()+" amount "+amount);
    }
}
