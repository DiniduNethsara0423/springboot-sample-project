package icet.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;

}
