REQUIREMENTS:
We will focus on the following set of requirements while designing the Airline Management System:

* Customers should be able to search for flights for a given date and source/destination airport.
* Customers should be able to reserve a ticket for any scheduled flight. Customers can also build a multi-flight itinerary.
* Users of the system can check flight schedules, their departure time, available seats, arrival time, and other flight details.
* Customers can make reservations for multiple passengers under one itinerary.
* Only the admin of the system can add new aircrafts, flights, and flight schedules. Admin can cancel any pre-scheduled flight (all stakeholders will be notified).
* Customers can cancel their reservation and itinerary.
* The system should be able to handle the assignment of pilots and crew members to flights.
* The system should be able to handle payments for reservations.
* The system should be able to send notifications to customers whenever a reservation is made/modified or there is an update for their flights.

DB DESIGN
    
    AIRPORT
    |AIRPORT ID|LOCATION|AIRPORT TYPE|CITY ID|
    
    CITY
    |CITYID|CITY LOCATION|COUNTRY|
    
    FLIGHT
    |FLIGHT NO|PLANE ID|SOURCE|DESTINATION|TIME|PILOT ID|DATE|ARRIVAL TIME|DEPARTURE TIME|FLIGHT_TYPE|
    
    RESERVATION
    |RESERVATION ID|PAYMENT_ID|
    
    PASSENGER
    |PASSENGERID|BOOKING ID|PASSENGER NAME|PHONE NUMBER|AGE|
    
    PLANE
    |PLANE ID|PLANE NAME|PLANE TYPE|
    
    USER
    |USER ID|PHONE|EMAIL|RESERVATION ID|
    
    PILOTS
    |PILOT ID|PILOT NAME|PILOT DETAILS|
    
    SEAT
    |SEAT_ID|RESERVATION ID|FLIGHT NO|SEAT_STATUS|SEAT_PRICE|
    
    PAYMENT
    |PAYMENT_ID|PAYMENT TYPE|PRICE PAID
    
* Customers should be able to search for flights for a given date and source/destination airport.
    * select * from flight where  DATE=, source= and destination=
    
* Customers should be able to reserve a ticket for any scheduled flight. Customers can also build a multi-flight itinerary.
    * To book tickets first search for tickets in seat table. Once they have locked seats and made payments
    they update seats table with reservation id and reservation table with reservation table and payment id
    