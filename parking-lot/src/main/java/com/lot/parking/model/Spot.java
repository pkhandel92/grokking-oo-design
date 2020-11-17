package com.lot.parking.model;


public class Spot {
    private int spotId;
    private SpotType type;
    private Floor floor;
    private boolean spotAvailable;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private Ticket ticket;
    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public SpotType getType() {
        return type;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setType(SpotType type) {
        this.type = type;
    }

    public boolean isSpotAvailable() {
        return spotAvailable;
    }

    public void setSpotAvailable(boolean spotAvailable) {
        this.spotAvailable = spotAvailable;
    }
}
