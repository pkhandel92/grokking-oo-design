package library.mgmt.reservation;

import library.mgmt.account.IAccount;
import library.mgmt.book.Book;
import library.mgmt.book.BookItem;

import java.util.List;

public interface IReservationService {
    public BookItem checkout(Book book,IAccount account);
    public List<BookItem> getReservedBooks(IAccount account);
}
