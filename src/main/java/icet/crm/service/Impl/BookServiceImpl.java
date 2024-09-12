package icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import icet.crm.dto.Book;
import icet.crm.entity.BookEntity;
import icet.crm.repository.BookRepository;
import icet.crm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
@Autowired
    BookRepository bookRepository;
@Autowired
    ObjectMapper mapper;

    @Override
    public Book createBook(Book book) {
        //model entity conversion
        BookEntity entity=mapper.convertValue(book,BookEntity.class);
        System.out.println(entity.getAuthorEntity());

        //saving data
        bookRepository.save(entity);
        return (mapper.convertValue(entity,Book.class));




    }
}
