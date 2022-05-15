package com.orderservice.sellingapp.OrderService.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "order")
public class Order {
    String id;
    String customerId;
    String placedDate;
    String itemId;
    String itemQty;
}
