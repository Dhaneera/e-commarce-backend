package edu.clothify.repository;

import edu.clothify.entity.SubCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository  extends CrudRepository<SubCategory,Long> {
    SubCategory getByName(String name);
}
