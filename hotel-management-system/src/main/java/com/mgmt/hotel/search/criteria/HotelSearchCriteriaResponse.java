package com.mgmt.hotel.search.criteria;

import com.mgmt.hotel.hotel.Hotel;

import java.util.List;

public class HotelSearchCriteriaResponse implements SearchCriteriaResponse {
    private List<Hotel> hotels;

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
