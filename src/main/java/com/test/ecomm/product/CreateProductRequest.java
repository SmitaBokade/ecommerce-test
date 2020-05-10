package com.test.ecomm.product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequest {

    private String productName;
    private int quantity;

    public Product toProduct() {
        Product product = new Product();
        product.setName(productName);
        product.setQuantity(quantity);
        return product;
    }
}
