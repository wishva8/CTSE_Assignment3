package com.orderservice.sellingapp.OrderService.controller;

import com.orderservice.sellingapp.OrderService.entity.Order;
import com.orderservice.sellingapp.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderServiceController {

    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
    @GetMapping("/all")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }
    @GetMapping("/test")
    public String getTest(){
        return "Deployed and working";
    }
}
