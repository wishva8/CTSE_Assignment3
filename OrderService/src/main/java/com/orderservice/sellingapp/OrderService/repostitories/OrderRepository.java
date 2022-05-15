package com.orderservice.sellingapp.OrderService.repostitories;

import com.orderservice.sellingapp.OrderService.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
