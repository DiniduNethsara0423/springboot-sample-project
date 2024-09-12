package icet.crm.dto;

import icet.crm.entity.AuthorEntity;
import icet.crm.entity.BookEntity;
import lombok.Data;

import java.util.List;

@Data
public class Author {
    private Long id;
    private String name;
    private List<BookEntity> bookEntities;
}
