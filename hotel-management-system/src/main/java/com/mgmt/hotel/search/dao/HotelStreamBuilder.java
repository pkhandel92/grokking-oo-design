package com.mgmt.hotel.search.dao;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.search.dao.stream.StreamBuilder;

import java.util.stream.Stream;

public class HotelStreamBuilder implements StreamBuilder<Hotel> {
    private Stream<Hotel> stream;
    public  HotelStreamBuilder (Stream<Hotel> stream){
        this.stream=stream;
    }
    public StreamBuilder<Hotel> filter( String category,String filter){
        if(category!=null&&!category.isEmpty())
        {
            this.stream=stream.filter(hotel -> getFilter(filter,hotel).equalsIgnoreCase(category));
        }
        return this;
    }

    @Override
    public StreamBuilder<Hotel> filter(Stream<Hotel> stream, Integer category, String filter) {
        return this;
    }
    public Stream<Hotel> build(){
        return stream;
    }

    private String getFilter(String filter,Hotel hotel) {
        switch (filter){
            case "LOCATION": return hotel.getLocation();

            case "CITY": return hotel.getCity();

            case "HOTEL_GROUP": return hotel.getHotelGroup();
            default: return "";//This should ne excpetion
        }
    }
}
