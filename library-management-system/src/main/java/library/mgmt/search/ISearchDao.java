package library.mgmt.search;

import library.mgmt.book.Book;

import java.util.Date;
import java.util.List;

public interface ISearchDao {
    public Book searchByTitle(String title);
    public List<Book> searchByAuthor(String book);
    public List<Book> searchByPublishDate(Date publishDate);
    public Book searchBook(Book book);
}
