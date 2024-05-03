package edu.clothify.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.clothify.dto.OrdersDto;
import edu.clothify.entity.Orders;
import edu.clothify.repository.OrdersRepository;
import edu.clothify.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrdersService {
    @Autowired
    OrdersRepository orderRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public boolean addOrder(OrdersDto orderDto) {
        Orders orders=objectMapper.convertValue(orderDto, Orders.class);
        Orders savedOrders=orderRepository.save(orders);
        return savedOrders.getId() != null;
    }
}