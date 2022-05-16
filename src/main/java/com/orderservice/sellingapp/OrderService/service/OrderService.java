package com.orderservice.sellingapp.OrderService.service;

import com.orderservice.sellingapp.OrderService.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface OrderService {
    Order addOrder(Order order);
    List<Order> getOrders();
}
