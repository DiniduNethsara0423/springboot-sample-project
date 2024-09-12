package icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import icet.crm.dto.Author;
import icet.crm.entity.AuthorEntity;
import icet.crm.repository.AuthorRepository;
import icet.crm.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public Author createAuthor(Author author) {
        //model entity conversion
        AuthorEntity entity=mapper.convertValue(author,AuthorEntity.class);

        //saving data
        authorRepository.save(entity);
        return (mapper.convertValue(entity,Author.class));





    }
}
