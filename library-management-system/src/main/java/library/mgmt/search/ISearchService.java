package library.mgmt.search;

import library.mgmt.book.Book;

import java.util.Date;
import java.util.List;

public interface ISearchService {

  /*
   * Maybe methods to serch by genre and language can be added. Also, multiple search filters should be supported, this
   * interface cannot combine different search criteria.
   */
    public Book searchByTitle(String title);
    public List<Book> searchByAuthor(String book);
    public List<Book> searchByPublishDate(Date publishDate);
    public Book searchBook(Book book);
}
