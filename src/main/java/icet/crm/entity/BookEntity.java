package icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;


@ManyToOne
@JoinColumn(name="author_id")
    private AuthorEntity authorEntity;


@OneToMany(mappedBy = "bookEntity",cascade = CascadeType.ALL)
private List<BookCategory> bookCategories;

}
