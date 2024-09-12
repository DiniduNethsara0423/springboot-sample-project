package icet.crm.repository;

import icet.crm.entity.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<AuthorEntity,Long> {
}
