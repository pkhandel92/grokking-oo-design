package com.mgmt.hotel.search.criteria;

public class HotelSearchCriteria implements SearchCriteria {
    private String city;
    private String location;
    private String hotelGroup;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getHotelGroup() {
        return hotelGroup;
    }

    public void setHotelGroup(String hotelGroup) {
        this.hotelGroup = hotelGroup;
    }
}
