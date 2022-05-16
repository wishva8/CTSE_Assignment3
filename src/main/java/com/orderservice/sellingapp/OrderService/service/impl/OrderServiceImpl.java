package com.orderservice.sellingapp.OrderService.service.impl;

import com.orderservice.sellingapp.OrderService.entity.Order;
import com.orderservice.sellingapp.OrderService.repostitories.OrderRepository;
import com.orderservice.sellingapp.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
