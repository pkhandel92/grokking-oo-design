package library.mgmt.lending;

import library.mgmt.account.IAccount;
import library.mgmt.book.BookItem;

public interface ILendingService {
  
  /*
   * I think an overloaded method #fetchLendingDetails(IAccount account) can be added which returns
   * List<LendingDetails>. It could be a hectic task to do a book by book search for the librerian
   */
    public LendingDetails fetchLendingDetails(BookItem bookItem, IAccount account);

    public boolean lendBook(BookItem bookItem);
}
