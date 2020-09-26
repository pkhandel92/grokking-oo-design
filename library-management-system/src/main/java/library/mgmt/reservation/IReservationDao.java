package library.mgmt.reservation;

import library.mgmt.account.IAccount;
import library.mgmt.book.Book;
import library.mgmt.book.BookItem;

import java.util.List;

public interface IReservationDao {
    public BookItem getReservationDetails(Book book);
    public List<BookItem> getReserverBooksForUser(IAccount account);
}
