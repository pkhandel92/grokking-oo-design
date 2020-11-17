package com.lot.parking.service;

import com.lot.parking.dao.ParkingDao;
import com.lot.parking.model.Spot;
import com.lot.parking.model.Ticket;
import com.lot.parking.model.Vehicle;
import com.lot.parking.service.request.ParkingRequest;

public class ParkingFacade {
    private ParkingDao lotDao;

    public ParkingFacade(ParkingDao lotDao) {
        this.lotDao = lotDao;
    }

    public Ticket park(ParkingRequest parkingRequest, Vehicle vehicle) {
        try {
        Spot spot= lotDao.getAvailableSpots(parkingRequest,vehicle);
        Ticket ticket=lotDao.getTicket( parkingRequest.getCustomer(),spot,vehicle);
        return ticket;
        } catch (Exception e) {
            //logException
        }
        return null;
    }

    public void unpark(Spot spot) {
        lotDao.unpark(spot);
    }
}
