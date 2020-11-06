package nija.webshop.repository;

import nija.webshop.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemJpaRepository extends CrudRepository<Item, Integer> {
}
