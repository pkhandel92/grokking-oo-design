package library.mgmt.reservation;

import library.mgmt.account.IAccount;
import library.mgmt.book.Book;
import library.mgmt.book.BookItem;

import java.util.List;

public class ReservationService implements IReservationService{
    private IReservationDao reservationDao;
    private int RESERVATION_CAPACITY=10;
    @Override
    public BookItem checkout(Book book,IAccount account) {
        /**
         * Assume gets data from DB
         */
        List<BookItem> booksReserved=getReservedBooks(account);
        if(booksReserved!=null&&booksReserved.size()<=RESERVATION_CAPACITY) {
            BookItem bookItem = reservationDao.getReservationDetails(book);
            return bookItem;
        }
        else{
            //logg error
            return null;
        }
    }

    @Override
    public List<BookItem> getReservedBooks(IAccount account) {

        return reservationDao.getReserverBooksForUser(account);
    }
}
