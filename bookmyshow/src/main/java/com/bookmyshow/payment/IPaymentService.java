package com.bookmyshow.payment;

import com.bookmyshow.booking.BookingRequest;

public interface IPaymentService {
    public PaymentResponse makePayment(BookingRequest bookingRequest);
}
