package icet.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;

}
