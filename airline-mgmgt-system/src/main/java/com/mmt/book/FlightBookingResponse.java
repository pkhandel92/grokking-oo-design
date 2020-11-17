package com.mmt.book;

import com.mmt.model.Passenger;
import com.mmt.model.Seat;

import java.util.Date;
import java.util.List;

public class FlightBookingResponse {
    private String reservationId;
    private String paymentId;
    private String flightNo;
    private String arrival;
    private String departure;
    private List<Passenger> passengers;
    private List<Seat> seatsReserved;


}
