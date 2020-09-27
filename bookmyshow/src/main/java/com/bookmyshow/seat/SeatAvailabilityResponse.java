package com.bookmyshow.seat;

import java.util.List;

public class SeatAvailabilityResponse {
    private List<Seat> availableSeats;

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<Seat> availableSeats) {
        this.availableSeats = availableSeats;
    }
}
