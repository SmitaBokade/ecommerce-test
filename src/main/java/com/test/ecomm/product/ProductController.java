package com.test.ecomm.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/products")
    public void createProduct(@RequestBody CreateProductRequest createProductRequest) {

        mongoTemplate.save(createProductRequest.toProduct());
    }
}
