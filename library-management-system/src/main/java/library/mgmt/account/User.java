package library.mgmt.account;

import library.mgmt.book.Book;
import library.mgmt.book.BookItem;
import library.mgmt.lending.ILendingService;
import library.mgmt.lending.LendingDetails;
import library.mgmt.login.ILogin;
import library.mgmt.reservation.IReservationService;

public class User implements IAccount {
    private ILogin login;
    private String id;
    private String name;
    private  String address;
    private  String email;
    private IReservationService reservationService;
    private ILendingService lendingService;
    public User(String uid, String name, String address, String email) {
    this.id=uid;this.email=email;this.address=address;this.email=email;
    }

    public boolean login(String uid, CharSequence password) {
        return login.login(uid,password);
    }

    public boolean cancelMembership(String uid) {
        return false;
    }

    public boolean changePassword(String uid, CharSequence curPass, CharSequence newPass) {
        return login.changePass(uid,curPass,newPass);
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
    public boolean checkout(Book book){
      BookItem bookItem=  reservationService.checkout(book,this);
      if(bookItem!=null)
      {
         return lendingService.lendBook(bookItem);
      }
      else{
          //log Message
          return false;
      }
    }
    public LendingDetails returnBook(BookItem bookItem){
        LendingDetails details= lendingService.fetchLendingDetails(bookItem,this);
        return details;
    }
}
