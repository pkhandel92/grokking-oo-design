package com.bookmyshow.seat;

/**
 * |AUDI NO|HALL ID|MOVIE ID|SEAT NO|SEAT_TYPE|SEAT_PRICE|SHOW_TIME|SEAT AVAILABLE|BOOKING ID|
 */
public class Seat {
    private String seatNo;
    private String audiNo;
    private String hallId;
    private SeatType seatType;
    private double price;
    private String showTime;
    private boolean isAvailable;
    private String bookingId;

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getAudiNo() {
        return audiNo;
    }

    public void setAudiNo(String audiNo) {
        this.audiNo = audiNo;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
