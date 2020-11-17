package com.mgmt.hotel.price;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.room.Room;

public class Price {
    private Room room;
    private int priceId;
    private double roomPrice;
    private double cancellationAmount;
    private boolean roomAvailable;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getCancellationAmount() {
        return cancellationAmount;
    }

    public void setCancellationAmount(double cancellationAmount) {
        this.cancellationAmount = cancellationAmount;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }
}
