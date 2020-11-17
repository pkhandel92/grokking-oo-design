package com.lot.parking.service;

import com.lot.parking.model.Spot;
import com.lot.parking.model.Ticket;
import com.lot.parking.model.Vehicle;
import com.lot.parking.service.request.ParkingRequest;

import java.util.List;

public interface IParkingService {
    public Ticket park(ParkingRequest parkingRequest, Vehicle Vehicle);
    public void unpark(Spot spot);
    public List<Spot> getAvailableSpots(int lotId);
    public void addSpot(Spot spot,int floorId,int lotId);
    public void addFloor(int lot);
}
