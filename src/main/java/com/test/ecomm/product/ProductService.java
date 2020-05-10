package com.test.ecomm.product;

import com.test.ecomm.order.Order;
import com.test.ecomm.order.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.BulkOperations.BulkMode.UNORDERED;

@Service
public class ProductService {
    @Autowired
    private MongoTemplate mongoTemplate;

    private void updateQuantity(List<OrderItem> orderItems) {

        BulkOperations bulkOperations = mongoTemplate.bulkOps(UNORDERED, Product.class);
        orderItems.forEach(oi -> {
            Criteria criteria = Criteria.where("id").is(oi.getProductId());
            Query query = new Query(criteria);
            Update update = new Update();
            update.inc("quantity", -oi.getQuantity());
            bulkOperations.updateOne(query, update);
        });
        bulkOperations.execute();
    }

    public void updateStock(Order toOrder) {
        mongoTemplate.save(toOrder);
        updateQuantity(toOrder.getOrderItems());
    }
}
