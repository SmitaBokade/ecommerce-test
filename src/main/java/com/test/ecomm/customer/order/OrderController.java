package com.test.ecomm.customer.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/orders")
    public void createOrder() {

    }
}
