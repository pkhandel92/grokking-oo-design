package com.bookmyshow.booking;

import com.bookmyshow.seat.Seat;
import com.bookmyshow.seat.SeatAvailabilityResponse;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingId;
    private List<Seat> seatList;
    private Date createdOn;
    private String paymentId;
    private String bookingStatus;
    private int bookingCode;
    private SeatAvailabilityResponse seatAvailabilityResponse;

    public SeatAvailabilityResponse getSeatAvailabilityResponse() {
        return seatAvailabilityResponse;
    }

    public void setSeatAvailabilityResponse(SeatAvailabilityResponse seatAvailabilityResponse) {
        this.seatAvailabilityResponse = seatAvailabilityResponse;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
