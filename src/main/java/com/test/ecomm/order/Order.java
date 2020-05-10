package com.test.ecomm.order;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Order {

    @Id
    private String id;
    private List<OrderItem> orderItems;
}