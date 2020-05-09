package com.test.ecomm.customer.order;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
public class Order {

    @Id
    private String orderId;
    private List<String> productId;
    private String orderBy;

}

