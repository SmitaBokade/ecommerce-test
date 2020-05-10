package com.test.ecomm.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/products/{productId}/stock")
    public ProductStockResponse getProductStock(@PathVariable String productId) {

        StockKeepingUnit stockKeepingUnit = mongoTemplate.findById(productId, StockKeepingUnit.class);
        ProductStockResponse productStockResponse = new ProductStockResponse();
        productStockResponse.setProductId(productId);
        productStockResponse.setProductName(stockKeepingUnit.getProductName());
        productStockResponse.setQuantityAvailable(stockKeepingUnit.getQuantity());
        return productStockResponse;

    }

}
