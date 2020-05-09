package com.test.ecomm.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class);
    }
}
