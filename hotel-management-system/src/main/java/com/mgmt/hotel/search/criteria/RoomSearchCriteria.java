package com.mgmt.hotel.search.criteria;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.room.RoomType;

public class RoomSearchCriteria implements SearchCriteria {
    private RoomType roomType;
    private Hotel hotel;
    private double amount;
    private int floor;


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
