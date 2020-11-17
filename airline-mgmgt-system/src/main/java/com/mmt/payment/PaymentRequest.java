package com.mmt.payment;

import java.util.Arrays;

public class PaymentRequest {
    private PaymentDetails paymentDetails;
    private PaymentType type;
    private double amount;
    int [] nums;

    public PaymentDetails getPaymentDetails() {
        
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
