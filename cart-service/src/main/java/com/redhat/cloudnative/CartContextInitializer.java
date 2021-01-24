package com.redhat.cloudnative;

import com.redhat.cloudnative.model.Product;
import com.redhat.cloudnative.model.Promotion;
import com.redhat.cloudnative.model.ShoppingCart;
import com.redhat.cloudnative.model.ShoppingCartItem;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = {Product.class, Promotion.class, ShoppingCart.class, ShoppingCartItem.class}, schemaPackageName = "cart_sample")
interface CartContextInitializer extends SerializationContextInitializer {
}