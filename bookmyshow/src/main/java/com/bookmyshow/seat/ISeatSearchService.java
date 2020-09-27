package com.bookmyshow.seat;

import com.bookmyshow.booking.BookingRequest;

import java.util.List;

public interface ISeatSearchService {
    public List<Hall> getHallsByLocation(String location);
    public List<Hall> getHallsByMovieAndLocation(String location,String movieId);
    public List<Seat> getSeat(String location,String showTime);
    public List<Seat> getSeat(String showTime);
    public List<Seat> getSeat(String location,String showTime,SeatType type);

    public SeatAvailabilityResponse checkSeatAvailability(BookingRequest bookingRequest);
}
