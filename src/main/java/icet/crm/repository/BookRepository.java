package icet.crm.repository;

import icet.crm.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity,Long> {
}
