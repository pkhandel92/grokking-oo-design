package com.amazon.sale;

import com.amazon.account.User;
import com.amazon.item.Product;
import com.amazon.payment.PaymentType;

public interface ISaleService {
    public OrderResponse buyNow(Product product, PaymentType paymentType);
    public OrderResponse checkOutCart(User user);
}
