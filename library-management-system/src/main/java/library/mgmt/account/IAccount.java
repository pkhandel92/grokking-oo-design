package library.mgmt.account;

public interface IAccount {
    public boolean login(String uid,CharSequence password);
    public boolean cancelMembership(String uid);
    public boolean changePassword(String uid, CharSequence curPass, CharSequence newPass);
    public boolean scanBarCode();
    public String getName();
    public String getEmail();
    public String getID();
}
