package library.mgmt.lending;

import library.mgmt.account.IAccount;
import library.mgmt.book.BookItem;

public class LendingService implements ILendingService{
    private ILendingDao lendingDao;
    @Override
    public LendingDetails fetchLendingDetails(BookItem bookItem, IAccount account) {
        return lendingDao.fetchLendingDetails(account,bookItem);
    }

    @Override
    public boolean lendBook(BookItem bookItem) {
        return lendingDao.lendBook(bookItem);
    }
}
