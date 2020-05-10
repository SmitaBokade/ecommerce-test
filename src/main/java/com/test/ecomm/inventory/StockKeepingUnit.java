package com.test.ecomm.inventory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class StockKeepingUnit {
    @Id
    private String productId;
    private String productName;
    private int quantity;
}


