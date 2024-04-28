package edu.clothify.repository;

import edu.clothify.entity.Collection;
import org.springframework.data.repository.CrudRepository;

public interface CollectionRepository extends CrudRepository< Collection ,Long> {
    Collection getByName(String name);

}
