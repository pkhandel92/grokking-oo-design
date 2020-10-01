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
    /*
     * SeatAvailabilityResponse is not related to post booking status. This is not important in context of Booking. Once
     * a booking is done, seat availability is irrelevant.
     * If this class is being used for pre-booking search/filter, as well as final booking status, it's breaking single responsibility principle.
     * If not, then this field could be removed.
     */
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
