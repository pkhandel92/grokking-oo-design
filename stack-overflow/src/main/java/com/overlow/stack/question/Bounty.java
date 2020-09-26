package com.overlow.stack.question;

import java.util.Date;

public class Bounty {
    private int reputation;
    private Date expiry;
    //TBD
    public boolean modifyReputation(int reputation){
        return true;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
