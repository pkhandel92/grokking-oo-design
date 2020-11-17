package com.lot.parking.model;

public abstract class Vehicle {
    private VehicleType type;
    private String regNo;
    private String vehicleColor;
    public Vehicle(VehicleType type){
        this.type=type;    }

    public String getRegNo() {
        return regNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
