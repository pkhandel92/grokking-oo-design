package library.mgmt.account;

import library.mgmt.book.Book;
import library.mgmt.book.BookItem;
import library.mgmt.catalog.ICatalog;
import library.mgmt.login.ILogin;
import library.mgmt.membership.IMembershipService;

public class Librarian implements IAccount {
    private String name;
    private String id;
    private String address;
    private String barcode;
    private String uid;
    private CharSequence password;
    private String email;
    private ILogin login;
    private IMembershipService membershipService;
    private ICatalog catalog;
    public Librarian(String uid, String name, String address, String email) {
        this.uid=uid;
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public boolean login(String uid, CharSequence password) {
        return false;
    }

    public boolean cancelMembership(String uid) {
        return false;
    }

    public boolean changePassword(String uid, CharSequence curPass, CharSequence newPass) {
        return false;
    }

    public boolean scanBarCode() {
        return false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getID() {
        return id;
    }
    public boolean createAccount(String uid, String name, String address, String email){
        return login.createAccount(uid,name,address,email,AccountType.USER);
    }
    public boolean cancelMemberShip(IAccount account){
        return membershipService.cancelMemberShip(account);
    }
    public boolean addBook(BookItem bookItem,Book book){
        return catalog.addBook(bookItem,book);
    }
    public boolean removeBook(BookItem bookItem,Book book){
        return catalog.removeBook(bookItem,book);
    }
}
