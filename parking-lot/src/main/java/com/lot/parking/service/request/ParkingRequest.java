package com.lot.parking.service.request;

import com.lot.parking.model.Customer;

public class ParkingRequest {
    private int lotId;
    private int floorId;
    private Customer customer;
    public int getLotId() {
        return lotId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }
}
