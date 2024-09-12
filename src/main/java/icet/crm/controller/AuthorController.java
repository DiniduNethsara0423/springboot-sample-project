package icet.crm.controller;

import icet.crm.dto.Author;
import icet.crm.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/author")
    Author createAuthor(@RequestBody Author author){
        return authorService.createAuthor(author);
    }
}
