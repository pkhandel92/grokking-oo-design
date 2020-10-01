package library.mgmt.login;

import library.mgmt.account.AccountType;
import library.mgmt.account.IAccount;

/**
 * Not implementing Signup feature here
 * Reason: The process might be diffferent for different actors
 * Signup should be separate from Login to maintain
 * Interface segregation
 */
public interface ILogin {
    public boolean login(String uid,CharSequence pass);
    public boolean changePass(String uid,CharSequence currPass,CharSequence changePass);
    public String forgetPass(IAccount uid);

    /* 
     * This method should not exist here, based on the comments written on top. 
     * It should go to signup interface. 
     */
    public boolean createAccount(String uid, String name, String address, String email, AccountType accountType);
}
