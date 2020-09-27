package com.bookmyshow.booking;

import com.bookmyshow.payment.PaymentType;
import com.bookmyshow.seat.Seat;
import com.bookmyshow.user.User;

import java.util.List;

public class BookingRequest {
    private List<Seat> seatsToBook;
    private User user;
    private double price;
    private PaymentType paymentType;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Seat> getSeatsToBook() {
        return seatsToBook;
    }

    public void setSeatsToBook(List<Seat> seatsToBook) {
        this.seatsToBook = seatsToBook;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
