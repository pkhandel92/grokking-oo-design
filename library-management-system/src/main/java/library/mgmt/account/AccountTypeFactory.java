package library.mgmt.account;

public class AccountTypeFactory {
    public static IAccount getAccount(String uid, String name, String address, String email, AccountType accountType) {
        switch (accountType){
            case LIBRARIAN:return new Librarian(uid,name,address,email);
            case USER:return new User(uid,name,address,email);
            default:return null;
        }
    }
}
