package com.mgmt.hotel.hotel;

public class Hotel {
    private String hotelId;
    private String location;
    private String city;
    private String hotelGroup;
    private String hotelName;
    private STAR star;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelGroup() {
        return hotelGroup;
    }

    public void setHotelGroup(String hotelGroup) {
        this.hotelGroup = hotelGroup;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public STAR getStar() {
        return star;
    }

    public void setStar(STAR star) {
        this.star = star;
    }
}
