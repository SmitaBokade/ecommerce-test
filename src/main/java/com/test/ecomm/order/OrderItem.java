package com.test.ecomm.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {

    private String productId;
    private String productName;
    private int quantity;

}
