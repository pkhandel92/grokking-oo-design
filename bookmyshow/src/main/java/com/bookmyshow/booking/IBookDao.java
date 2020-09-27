package com.bookmyshow.booking;

import com.bookmyshow.seat.Seat;

import java.util.List;

public interface IBookDao {
    public boolean blockSeats(List<Seat> seats);
    public boolean bookSeat(BookingRequest request);
    public Booking getBooking(String bookingRequest);
}
