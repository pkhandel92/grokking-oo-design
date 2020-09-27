REQUIREMENTS:

Our ticket booking service should meet the following requirements:

* It should be able to list the cities where affiliate cinemas are located.
* Each cinema can have multiple halls and each hall can run one movie show at a time.
* Each Movie will have multiple shows.
* Customers should be able to search movies by their title, language, genre, release date, and city name.
* Once the customer selects a movie, the service should display the cinemas running that movie and its available shows.
* The customer should be able to select a show at a particular cinema and book their tickets.
* The service should show the customer the seating arrangement of the cinema hall. The customer should be able to select multiple seats according to their preference.
* The customer should be able to distinguish between available seats and booked ones.
* The system should send notifications whenever there is a new movie, as well as when a booking is made or canceled.
* Customers of our system should be able to pay with credit cards or cash.
* The system should ensure that no two customers can reserve the same seat.
* Customers should be able to add a discount coupon to their payment.




___________________________________________________________________________________________________________
* assumption we make a call to the cinema's api for a ticket which handlles all locking and ticket details for us

DATABASE DESIGN based on above requirements

TABLES
    
    CINEMA HALLS(PK(HALL_ID)
    |HALL_ID|NAME|CITYID|LOCATION|
    
    CITY
    |CITY|CITY_NAME|
    AUDI(AUDI NO|HALLID|SHOWTIME|SEATNO)
    |AUDI NO|HALL ID|
    
    SHOW
    |SHOW_ID|AUDI_ID|START_TIME|END_TIME|MOVIEID|
    
    SHOW_SEAT
    |SHOW_SEAT_ID|SHOW_ID|SEAT_ID|SEAT_TYPE|SEAT_STATUS|SEAT_PRICE|BOOKING_ID|
    MOVIE(PK MOVIE_ID)
    |MOVIE_ID|MOVIE_NAME|ACTORS|DIRECTOR|MOVIE_GENRE|TILE|
    
    USER(PK(USER_ID))
    |User id|Name|email|phone|location|
    
    BOOKING(BOOKING_ID) FK(SEAT DETAIL ID) FK2(PAYMENT_ID) 
    |BOOKING ID|PAYMENT ID|SHOW_SEAT_ID|
    
    PAYMENTS(PK PAYMENT_ID)
    |PAYMENT ID|PAYMENT TYPE|PRICE PAID|
    
    
Lets think of queries.

* find a movie x in place z;
select * from halls h join  movie m on h.movie_id=m.movie_id  where location=z, movie=x ;
* find all available seat in all halls for time x for movie m at location l

select * from audi a join movie m on a.movie_id=m.movie_id join hall h on a.hall_id=h.hall_id where h.location=x and a.seat_available=yes;
* find  a list of movies at location x;
select * from movie join hall on movie.movie_id=hall.movie_id where location =x;
* find all halls in location x
select * from halls where location=x;
* all movie on the mentioned genre
select * from movie where movie_genre in (${GENRE_VALUES})


Lets think of services

MovieService
* To search for movies

SeatSearchService
* to get available seats based on time and location

 
BookingService to book tickets 
* provided seats,hall and audi

PaymentService for payment of booking

