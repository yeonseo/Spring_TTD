package com.example.productorderservice.product;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
class ProductRepository {

    private long sequence = 0;
    private Map<Long, Product> persistence = new HashMap<>();

    void save(final Product product) {
        product.assignId(++sequence);
        persistence.put(product.getId(), product);
    }
}
