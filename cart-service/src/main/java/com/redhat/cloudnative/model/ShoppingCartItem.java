package com.redhat.cloudnative.model;

import io.vertx.core.json.Json;

import java.util.Objects;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

public class ShoppingCartItem {

    private double price;
    private int quantity;
    private double promoSavings;
    private Product product;

    public ShoppingCartItem() {

    }

    @ProtoFactory
    public ShoppingCartItem(double price, int quantity, double promoSavings, Product product) {
        this.price = Objects.requireNonNull(price);
        this.quantity = Objects.requireNonNull(quantity);
        this.promoSavings = Objects.requireNonNull(promoSavings);
        this.product = Objects.requireNonNull(product);
    }

    @ProtoField(number = 1)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @ProtoField(number = 2)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ProtoField(number = 3)
    public double getPromoSavings() {
        return promoSavings;
    }

    public void setPromoSavings(double promoSavings) {
        this.promoSavings = promoSavings;
    }

    @Override
    public String toString() {
        return Json.encode(this);
    }

    @ProtoField(number = 4)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
