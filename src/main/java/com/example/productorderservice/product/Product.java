package com.example.productorderservice.product;

import org.springframework.util.Assert;

final class Product {
    private long id;
    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;

    Product(String name, int price, DiscountPolicy discountPolicy) {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야합니다.");
        Assert.notNull(discountPolicy, "할인정책은 필수입니다.");
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }

    public void assignId(long l) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public DiscountPolicy discountPolicy() {
        return discountPolicy;
    }

    @Override
    public String toString() {
        return "Product[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "price=" + price + ", " +
                "discountPolicy=" + discountPolicy + ']';
    }
}
