### Search hotels by city and country
    
    getHotelByCity(String city,String country)//GET
    getHotelByCityAndPostalCode(String city,String postalCode)//GET
    getHotelByHotelNameAndCity(String city,String hotel)//GET
### Search available rooms
    getAvailableRoom(String hotelId)//GET return List<Room>
    getAvailableRoomByView(String hotel,String viewType)//GET List<Room>
    
### Verify Room
    verifyUserSelectedRoomAvailability(String hotelId,String roomId,Stringg arrival_date,String departureDate,int beds);//GET Returns available room details
    blockRoom(List<Room>)//POST call to block room can return status of the operation
### Make Payment
    payment(List<String. rooms,String amountCharge);//returns details such as PaymentID 
### Book Rooms   
    bookRoom(String paymentId,String hotelId,List<String> roomId)// POST Return BookingDetails(contains booking id,booking type etc)
