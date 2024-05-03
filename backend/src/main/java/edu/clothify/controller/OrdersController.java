package edu.clothify.controller;

import edu.clothify.dto.OrdersDto;
import edu.clothify.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrdersController {
    @Autowired
    OrdersService orderService;

    @PostMapping("/add")
    public boolean addOrder(@RequestBody OrdersDto orderDto){
        return orderService.addOrder(orderDto);
    }
}
