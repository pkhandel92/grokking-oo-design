package library.mgmt.login;

import library.mgmt.account.AccountType;
import library.mgmt.account.AccountTypeFactory;
import library.mgmt.account.IAccount;

import java.util.HashMap;
import java.util.Map;

public class Login implements ILogin {
    /**
     * Just to mock login functionality
     */
    public static Map<String,CharSequence> loginMap;
    static {
        loginMap=new HashMap<String, CharSequence>();
        loginMap.put("librarian","librarian");
        loginMap.put("User","user");
    }
    public boolean login(String uid, CharSequence pass) {
        return pass!=null&&pass.equals(loginMap.get(uid));
    }

    public boolean changePass(String uid, CharSequence currPass, CharSequence changePass) {
        if(loginMap.containsKey(uid)&&loginMap.get(uid).equals(currPass)) {
            loginMap.put(uid, changePass);
            return true;
        }else{
            return false;
        }
    }

    public String forgetPass(IAccount uid) {
        /**
         * Mock functionaity to send email to account id's email
         */
        return uid.getEmail();
    }

    public boolean createAccount(String uid, String name, String address, String email, AccountType accountType) {
        IAccount account= AccountTypeFactory.getAccount(uid,name,address,email,accountType);
        return false;
    }

}
