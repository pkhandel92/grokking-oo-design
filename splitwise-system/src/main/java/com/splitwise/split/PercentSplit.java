package com.splitwise.split;

import com.splitwise.user.User;

public class PercentSplit extends Split{
    private double percent;
    public PercentSplit(User user,SplitType type, double percent) {
        super(user,SplitType.PERCENT);
        this.percent=percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
