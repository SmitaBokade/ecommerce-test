package com.test.ecomm.admin;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class Product {

    @Id
    private String productId;
    private String productName;


}
