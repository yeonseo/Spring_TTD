package com.example.productorderservice.product;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
class ProductService {
    private final ProductPort productPort;

    ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public void addProduct(AddProductRequest request) {
        final Product product = new Product(request.name, request.price, request.discountPolicy);
        productPort.save(product);
    }

}
