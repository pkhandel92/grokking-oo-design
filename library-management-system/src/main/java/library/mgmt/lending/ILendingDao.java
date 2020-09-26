package library.mgmt.lending;

import library.mgmt.account.IAccount;
import library.mgmt.book.BookItem;

public interface ILendingDao {
    public LendingDetails fetchLendingDetails(IAccount account, BookItem bookItem);

   public boolean lendBook(BookItem bookItem);
}
