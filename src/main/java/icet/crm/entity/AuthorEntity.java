package icet.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;



}
