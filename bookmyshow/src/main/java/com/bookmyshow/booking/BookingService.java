package com.bookmyshow.booking;

public class BookingService implements IBookingService{

    private BookingFacade facade;

    public BookingService(BookingFacade facade) {
        this.facade = facade;
    }

    @Override
    public Booking makeBooking(BookingRequest bookingRequest) {
       return facade.book(bookingRequest);
    }
}
