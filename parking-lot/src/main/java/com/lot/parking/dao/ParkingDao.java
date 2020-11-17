package com.lot.parking.dao;

import com.lot.parking.model.*;
import com.lot.parking.service.request.ParkingRequest;

import java.util.*;

public class ParkingDao {
    private Map<Integer,List<Floor> >lotToFloor;
    private Map<Floor,List<Spot>> spotMap;
    private Map<Floor,List<Spot>> unavailableSpots;
    private List<Customer> customers;
    private Set<Ticket> ticketList;

    public Spot getAvailableSpots(ParkingRequest parkingRequest, Vehicle vehicle) throws Exception {
        if (lotToFloor.get(parkingRequest.getLotId())!=null&&!lotToFloor.get(parkingRequest.getLotId()).isEmpty()){
            Optional<Spot> optionalSpot= spotMap.get(lotToFloor.get(parkingRequest.getLotId())).stream().filter(spot->spot.getType().toString().equalsIgnoreCase(vehicle.getType()
            .toString())).findFirst();
            if(optionalSpot.isPresent())
                return optionalSpot.get();
            else{
                throw new Exception();
            }
        }else{
            throw new Exception();
        }
    }

    public Ticket getTicket(Customer customer, Spot spot, Vehicle vehicle) {
        customers.add(customer);
        spotMap.get(spot.getFloor()).remove(spot);
        List<Spot> unavailableSpotsonFloor=unavailableSpots.getOrDefault(spot.getFloor(),new ArrayList<>());
        unavailableSpotsonFloor.add(spot);
        unavailableSpots.put(spot.getFloor(),unavailableSpotsonFloor);
        Ticket.TicketBuilder builder=new Ticket.TicketBuilder() ;
        Ticket ticket= builder.buildCustomerId(customer.getCustomerId()).buildStartTime().buildVehicleId(vehicle.getRegNo()).buildSpotId(spot.getSpotId()).ticket();
        ticketList.add(ticket);
        return ticket;
    }

    public void unpark(Spot spot) {
        Ticket ticket=spot.getTicket();
        ticket.setEndTime(new Date(System.currentTimeMillis()));
        ticketList.add(ticket);
        List<Spot> unavailSpots=unavailableSpots.getOrDefault(spot.getFloor(),new ArrayList<>());
        unavailSpots.remove(spot);
        List<Spot> availableSpot=spotMap.getOrDefault(spot.getFloor(),new ArrayList<>());
        availableSpot.add(spot);
        spotMap.put(spot.getFloor(),availableSpot);
    }
}
