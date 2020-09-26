package com.amazon.sale;

import com.amazon.item.Product;

import java.util.List;

public class Order {
    private List<Product> productList;
    private String orderId;
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
