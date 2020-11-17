package library.mgmt.author;

import library.mgmt.book.Book;

import java.util.Date;
import java.util.List;

public class Author {
    private String name;
    private Date dob;
    private String authorId;
    /*
     *  The only use of this class can be seen as a field in class Book.
     *  If that's the case, the field booksAuthored here is redundant. Book already has a reference to author.
     */
    private List<Book> booksAuthored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public List<Book> getBooksAuthored() {
        return booksAuthored;
    }

    public void setBooksAuthored(List<Book> booksAuthored) {
        this.booksAuthored = booksAuthored;
    }
}
