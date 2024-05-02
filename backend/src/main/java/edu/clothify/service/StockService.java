package edu.clothify.service;

import edu.clothify.dto.StockDto;
import edu.clothify.entity.Stock;

import java.util.List;

public interface StockService {
    Boolean addStock(StockDto stockDto);

    public StockDto updateStock(Long id, StockDto stockDto);
    Boolean deleteStock(Long id);

    List<StockDto> listStock(Long id);

    StockDto getStockById(long id);
    List<Stock> getStockAccordingToSizeAndProduct(String size, Long id);
}
