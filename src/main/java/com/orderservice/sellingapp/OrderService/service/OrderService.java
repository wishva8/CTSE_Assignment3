package com.orderservice.sellingapp.OrderService.service;

import com.orderservice.sellingapp.OrderService.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface OrderService {
    Order addOrder(Order order);
}
