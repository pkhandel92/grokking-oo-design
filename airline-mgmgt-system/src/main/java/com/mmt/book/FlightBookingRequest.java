package com.mmt.book;

import com.mmt.model.Airport;
import com.mmt.model.FLightype;
import com.mmt.model.Passenger;
import com.mmt.model.Seat;

import java.util.List;

public class FlightBookingRequest {
    private String paymentId;
    private String flightNo;
    private List<Seat> seatDetails;
    private List<Passenger> passengerList;
    //No need
    private Airport source;
    //No need
    private Airport destination;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public List<Seat> getSeatDetails() {
        return seatDetails;
    }

    public void setSeatDetails(List<Seat> seatDetails) {
        this.seatDetails = seatDetails;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }
}
