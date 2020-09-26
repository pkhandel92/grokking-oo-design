package com.amazon.sale;

import com.amazon.payment.PaymentType;

public interface IPaymentService {
    public boolean paymentStatus(PaymentType paymentType,double price);
}
