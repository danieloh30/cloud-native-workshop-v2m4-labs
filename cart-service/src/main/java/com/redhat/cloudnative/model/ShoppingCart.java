package com.redhat.cloudnative.model;

import io.vertx.core.json.Json;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

public class ShoppingCart {

    private double cartItemTotal;
    private double cartItemPromoSavings;
    private double shippingTotal;
    private double shippingPromoSavings;
    private double cartTotal;
    private String cartId;
    private List<ShoppingCartItem> shoppingCartItemList = new ArrayList<ShoppingCartItem>();

    public ShoppingCart() {
    }

    @ProtoFactory
    public ShoppingCart(double cartItemTotal, double cartItemPromoSavings, double shippingTotal, double shippingPromoSavings, double cartTotal, String cartId, List<ShoppingCartItem> shoppingCartItemList) {
        this.cartItemTotal = Objects.requireNonNull(cartItemTotal);
        this.cartItemPromoSavings = Objects.requireNonNull(cartItemPromoSavings);
        this.shippingTotal = Objects.requireNonNull(shippingTotal);
        this.shippingPromoSavings = Objects.requireNonNull(shippingPromoSavings);
        this.cartTotal = Objects.requireNonNull(cartTotal);
        this.cartId = Objects.requireNonNull(cartId);
        this.shoppingCartItemList = shoppingCartItemList;
    }

    public ShoppingCart(String cartId) {
        this.cartId = cartId;
    }

    @ProtoField(number = 1, required = false)
    public double getCartItemTotal() {
        return cartItemTotal;
    }

    public void setCartItemTotal(double cartItemTotal) {
        this.cartItemTotal = cartItemTotal;
    }

    @ProtoField(number = 2)
    public double getCartItemPromoSavings() {
        return cartItemPromoSavings;
    }

    public void setCartItemPromoSavings(double cartItemPromoSavings) {
        this.cartItemPromoSavings = cartItemPromoSavings;
    }

    @ProtoField(number = 3)
    public double getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(double shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    @ProtoField(number = 4)
    public double getShippingPromoSavings() {
        return shippingPromoSavings;
    }

    public void setShippingPromoSavings(double shippingPromoSavings) {
        this.shippingPromoSavings = shippingPromoSavings;
    }

    @ProtoField(number = 5)
    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    @ProtoField(number = 6)
    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

   public List<ShoppingCartItem> getShoppingCartItemList() {
        return shoppingCartItemList;
    }

    public void setShoppingCartItemList(List<ShoppingCartItem> shoppingCartItemList) {
        this.shoppingCartItemList = shoppingCartItemList;
    }

    public void resetShoppingCartItemList() {
        shoppingCartItemList = new ArrayList<ShoppingCartItem>();
    }

    public void addShoppingCartItem(ShoppingCartItem sci) {

        if (sci != null) {

            shoppingCartItemList.add(sci);

        }

    }

    public boolean removeShoppingCartItem(ShoppingCartItem sci) {

        boolean removed = false;

        if (sci != null) {

            removed = shoppingCartItemList.remove(sci);

        }

        return removed;

    }
    
    @Override
    public String toString() {
        return Json.encode(this);
    }

}