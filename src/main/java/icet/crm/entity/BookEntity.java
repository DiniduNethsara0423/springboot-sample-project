package icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;


@ManyToOne()
@JoinColumn(name="AuthorId")
    private AuthorEntity authorEntity;


@OneToMany(mappedBy = "bookEntity",cascade = CascadeType.ALL)
private List<BookCategory> bookCategories;

}
