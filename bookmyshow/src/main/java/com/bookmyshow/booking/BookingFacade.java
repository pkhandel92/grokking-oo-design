package com.bookmyshow.booking;

import com.bookmyshow.payment.IPaymentService;
import com.bookmyshow.payment.PaymentResponse;
import com.bookmyshow.seat.ISeatSearchService;
import com.bookmyshow.seat.Seat;
import com.bookmyshow.seat.SeatAvailabilityResponse;

public class BookingFacade {
    private ISeatSearchService seatSearchService;
    private IBookDao bookDao;
    private IPaymentService paymentService;
    public BookingFacade(ISeatSearchService seatSearchService, IBookDao bookDao) {
        this.seatSearchService = seatSearchService;
        this.bookDao = bookDao;
    }

    public Booking book(BookingRequest bookingRequest) {
        Booking response=new Booking();
        SeatAvailabilityResponse seatAvailabilityResponse=seatSearchService.checkSeatAvailability(bookingRequest);
        boolean areSeatsAvailable=seatAvailabilityResponse.getAvailableSeats().size()==bookingRequest.getSeatsToBook().size();
        response.setSeatAvailabilityResponse(seatAvailabilityResponse);
        if(!areSeatsAvailable){
            handleFailure(response);
            return response;
        }
        //We do this at Database level to avoid dirty/phantom reads
        boolean areSeatsBlocked=bookDao.blockSeats(bookingRequest.getSeatsToBook());
        if (!areSeatsBlocked){
            handleFailure(response);
            return response;
        }

       PaymentResponse paymentResponse= paymentService.makePayment(bookingRequest);
        response.setPaymentId(paymentResponse.getPaymentId());
        if(!paymentResponse.getPaymentStatus().equalsIgnoreCase("SUCCESS")){
            handleFailure(response);
            return response;
        }
        //Updates the table with user details
        bookDao.bookSeat(bookingRequest);
        return response;
    }
    public Booking getBooking(String bookingRequest){
        return bookDao.getBooking(bookingRequest);
    }

    private void handleFailure(Booking response) {
        response.setBookingStatus("Failure");
    }
}
