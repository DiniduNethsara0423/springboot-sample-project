package icet.crm.dto;

import icet.crm.entity.AuthorEntity;
import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private AuthorEntity authorEntity;
}
