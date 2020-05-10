package com.test.ecomm.inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductStockRequest {
    private String productName;
    private int availableQuantity;

    public StockKeepingUnit toStockKeepingUnit() {
        StockKeepingUnit stockKeepingUnit = new StockKeepingUnit();
        stockKeepingUnit.setProductName(productName);
        stockKeepingUnit.setQuantity(availableQuantity);
        return stockKeepingUnit;
    }
}
