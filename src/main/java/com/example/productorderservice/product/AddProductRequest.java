package com.example.productorderservice.product;

import org.springframework.util.Assert;

import java.util.Objects;

public final class AddProductRequest {
    public final String name;
    public final int price;
    public final DiscountPolicy discountPolicy;


    public AddProductRequest(String name, int price, DiscountPolicy discountPolicy) {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야합니다.");
        Assert.notNull(discountPolicy, "할인정책은 필수입니다.");
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
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
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (AddProductRequest) obj;
        return Objects.equals(this.name, that.name) &&
                this.price == that.price &&
                Objects.equals(this.discountPolicy, that.discountPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, discountPolicy);
    }

    @Override
    public String toString() {
        return "AddProductRequest[" +
                "name=" + name + ", " +
                "price=" + price + ", " +
                "discountPolicy=" + discountPolicy + ']';
    }

}
