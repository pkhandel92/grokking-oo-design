Requirements

* The system should support the booking of different room types like standard, deluxe, family suite, etc.

* Guests should be able to search the room inventory and book any available room.

* The system should be able to retrieve information, such as who booked a particular room, or what rooms were booked by a specific customer.

* The system should allow customers to cancel their booking - and provide them with a full refund if the cancelation occurs before 24 hours of the check-in date.

* The system should be able to send notifications whenever the booking is nearing the check-in or check-out date.

* The system should maintain a room housekeeping log to keep track of all housekeeping tasks.

* Any customer should be able to add room services and food items.

* Customers can ask for different amenities.

* The customers should be able to pay their bills through credit card, check or cash.

Database Design

    Hotel
    |HOTEL_ID|HOTEL_NAME|CITY|STATE|COUNTRY|
    1Hotel->MRoom
    ROOM
    |ROOM_ID|HOTEL_ID|ROOM_TYPE|ROOM_VIEW|
    INVENTORY
    |INVENTORY_ID|ROOM_ID|HOTEL_ID|BEDS_AVAILABLE|ROOM_AVAILABLE|PRICE|CANCELLATION_CHARGES|RESERVATION_ID|
    1RESERVATION->MINVENTORY(ROOMS)
    RESERVATION
    |RESERVATION_ID|RESERVATION_IN_TIME|RESERVATION_OUT_TIME|BOOKING_AMOUNT|AMOUNT_PAYABLE|PAYMENT_ID|CUST_ID|
    1RESERVATION->MORDERS
    ORDER
    |ORDER_ID|ORDER_TYPE|ORDER_AMOUNT|RESERVATION_ID|
    PAYMENT
    |PAYMENT_ID|PAYMENT_TYPE|PAYMENT_DETAILS|
    CUSTOMER
    |CUST_ID|CUST_NAME|CUST_MOBILE|CUST_EMAIL|
   
   
      