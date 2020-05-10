package com.test.ecomm.order;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateOrderRequest {
    private List<OrderItem> orderItems;


    public Order toOrder() {
        Order order = new Order();
        order.setOrderItems(orderItems);
        return order;
    }

}
