package com.test.ecomm.inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductStockResponse {
    private String productId;
    private String productName;
    private int quantityAvailable;
}
