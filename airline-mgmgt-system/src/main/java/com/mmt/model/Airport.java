package com.mmt.model;

public class Airport {
    private String airportId;
    private City city;
    private AirportType airportType;
    private String location;

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public AirportType getAirportType() {
        return airportType;
    }

    public void setAirportType(AirportType airportType) {
        this.airportType = airportType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
enum AirportType{
    DEFENSE,
    PRIVATE,
    PUBLIC
}
