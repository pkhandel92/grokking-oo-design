package com.mgmt.hotel.search.dao;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.room.Room;
import com.mgmt.hotel.search.criteria.HotelSearchCriteria;
import com.mgmt.hotel.search.criteria.RoomSearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteria;

import java.util.List;

public interface SearchDao {
    public List<Hotel> searchHotels(HotelSearchCriteria criteria);
    public List<Room> searchRooms(RoomSearchCriteria criteria);
}
