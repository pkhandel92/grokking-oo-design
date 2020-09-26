package library.mgmt.search;

import library.mgmt.book.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchService implements ISearchService{
    private ISearchDao searchDao;
    public Book searchByTitle(String title) {
        /**
         * Assume a db call to get by title the
         * db call should be in searchDB;
         */
        if (title!=null&&title.isEmpty()){
            return null;
        }
        return searchDao.searchByTitle(title);
    }

    public List<Book> searchByAuthor(String author) {
        if(author!=null&&author.isEmpty()){
            return new ArrayList<Book>();
        }
        return searchDao.searchByAuthor(author);

    }

    public List<Book> searchByPublishDate(Date publishDate) {
        return searchDao.searchByPublishDate(publishDate);

    }

    public Book searchBook(Book book) {
        return null;
    }
}
