package library.mgmt.rest;

import library.mgmt.book.Book;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/book")
public class BookRestService {
    public List<Book> searchBook(){
        return null;
    }
}
