package com.amazon.sale;

import com.amazon.payment.PaymentType;

public class PurchaseDetails {
    double totalPrice;
    double totalDiscount;
    boolean isCashBackEnabled;
    private PaymentType paymentType;
    private Order orderDetails;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public boolean isCashBackEnabled() {
        return isCashBackEnabled;
    }

    public void setCashBackEnabled(boolean cashBackEnabled) {
        isCashBackEnabled = cashBackEnabled;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Order getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Order orderDetails) {
        this.orderDetails = orderDetails;
    }
}
