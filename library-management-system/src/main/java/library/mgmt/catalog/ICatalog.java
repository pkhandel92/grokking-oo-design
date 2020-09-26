package library.mgmt.catalog;

import library.mgmt.book.Book;
import library.mgmt.book.BookItem;

public interface ICatalog {
    public boolean addBook(BookItem bookItem, Book book);
    public boolean removeBook(BookItem bookItem,Book book);
}
