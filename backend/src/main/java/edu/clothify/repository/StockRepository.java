package edu.clothify.repository;

import edu.clothify.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface StockRepository extends CrudRepository<Stock,Long> {
    List<Stock> findBySizeAndProductId(String size, Long productId);
}
