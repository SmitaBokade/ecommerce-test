package com.test.ecomm.order;

import com.test.ecomm.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ProductService productService;

    @PostMapping("/orders")
    public void createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        productService.updateStock(createOrderRequest.toOrder());

    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return mongoTemplate.findAll(Order.class);
    }

}
