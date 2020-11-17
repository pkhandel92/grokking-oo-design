package com.mgmt.hotel.search.dao;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.room.Room;
import com.mgmt.hotel.search.criteria.HotelSearchCriteria;
import com.mgmt.hotel.search.criteria.RoomSearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteria;
import com.mgmt.hotel.search.dao.stream.StreamBuilder;
import com.sun.tools.javac.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchDaoImpl implements SearchDao{
    private List<Hotel> hotels;
    private List<Room>rooms;
    private Map<Hotel,List<Room>> roomsMap;


    @Override
    public List<Hotel> searchHotels(HotelSearchCriteria criteria) {
        Stream<Hotel> hotelStream=hotels.stream();
        HotelStreamBuilder builder=new HotelStreamBuilder(hotelStream);
        builder.filter(hotelStream,criteria.getCity(),"CITY").filter(hotelStream,criteria.getLocation(),"LOCATION");
        return builder.build().collect(Collectors.toList());
    }

    private boolean checkNotEmpty(Object city) {
        if(city instanceof String){
            return city!=null&&!((String) city).isEmpty();
        }
        return city!=null;
    }

    @Override
    public List<Room> searchRooms(RoomSearchCriteria criteria) {
        return null;
    }
}
