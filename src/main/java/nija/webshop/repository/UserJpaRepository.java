package nija.webshop.repository;

import nija.webshop.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserJpaRepository extends CrudRepository<User, Integer> {
}
