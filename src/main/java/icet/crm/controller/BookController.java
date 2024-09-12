package icet.crm.controller;

import icet.crm.dto.Book;
import icet.crm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    Book createBook(@RequestBody Book book){
        System.out.println(book);
        return bookService.createBook(book);
    }

}
