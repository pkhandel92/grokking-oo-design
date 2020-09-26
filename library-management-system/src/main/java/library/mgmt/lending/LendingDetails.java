package library.mgmt.lending;

import library.mgmt.account.IAccount;

import java.util.Date;

public class LendingDetails {
    private Date dateBorrowed;
    private IAccount account;
    private String dueDate;
    private  double fine;
    private boolean isFineApplicable;

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public IAccount getAccount() {
        return account;
    }

    public void setAccount(IAccount account) {
        this.account = account;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public boolean isFineApplicable() {
        return isFineApplicable;
    }

    public void setFineApplicable(boolean fineApplicable) {
        isFineApplicable = fineApplicable;
    }
}
