package com.mmt.search;

import com.mmt.model.Airport;

import java.util.Date;

public class FlightSearchRequest {
    private Airport sourceAirport;
    private Airport destinationAirport;
    //Depends on the system the customers will not generally search based on flight no but
    //if we allow that search
    private String flightNo;
    private Date date;

    public Airport getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(Airport sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
