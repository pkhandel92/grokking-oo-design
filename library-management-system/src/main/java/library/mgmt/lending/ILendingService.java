package library.mgmt.lending;

import library.mgmt.account.IAccount;
import library.mgmt.book.BookItem;

public interface ILendingService {
    public LendingDetails fetchLendingDetails(BookItem bookItem, IAccount account);

   public boolean lendBook(BookItem bookItem);
}
