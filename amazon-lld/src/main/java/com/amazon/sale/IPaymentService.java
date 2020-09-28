package com.amazon.sale;

import com.amazon.payment.PaymentType;

public interface IPaymentService {

  /*
   * Maybe this method can return an enum. It's better to have multiple status, the payment could be declined due to
   * multiple reasons, or it could be under processing
   */

  boolean paymentStatus(PaymentType paymentType, double price);
}
