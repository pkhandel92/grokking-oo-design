package com.lot.parking.service;

import com.lot.parking.model.Spot;
import com.lot.parking.model.Ticket;
import com.lot.parking.model.Vehicle;
import com.lot.parking.service.request.ParkingRequest;

import java.util.List;

public class ParkingService implements IParkingService{
    private ParkingFacade facade;
    @Override
    public Ticket park(ParkingRequest parkingRequest, Vehicle vehicle) {
        //check whether parking is available on the lot and floor
        return facade.park(parkingRequest,vehicle);
    }

    @Override
    public void unpark(Spot spot) {
        facade.unpark(spot);
    }

    @Override
    public List<Spot> getAvailableSpots(int lotId) {
        return null;
    }

    @Override
    public void addSpot(Spot spot, int floorId, int lotId) {

    }

    @Override
    public void addFloor(int lot) {

    }
}
