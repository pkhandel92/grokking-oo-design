package com.lot.parking.model;

import java.util.Date;
import java.util.Random;

public class Ticket {
    private int ticketId;
    private int spotId;
    private Date startTime;
    private Date endTime;
    private int paymentId;
    private int customerId;
    private String vehicleId;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    private Ticket(TicketBuilder ticketBuilder) {
        this.ticketId = ticketBuilder.ticketId;
        this.spotId = ticketBuilder.spotId;
        this.startTime = ticketBuilder.startTime;
        this.endTime = ticketBuilder.endTime;
        this.paymentId = ticketBuilder.paymentId;
        this.customerId = ticketBuilder.customerId;
        this.vehicleId = ticketBuilder.vehicleId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

   public static class TicketBuilder{
    private int ticketId;
    private int spotId;
    private Date startTime;
    private Date endTime;
    private int paymentId;
    private int customerId;
    private String vehicleId;
    public  TicketBuilder  buildTicketId(){
        Random random=new Random();
        this.ticketId= random.nextInt();
        return this;
    }
    public  TicketBuilder buildSpotId(int spotId){

        this.spotId=spotId;
        return this;
    }
    public  TicketBuilder  buildStartTime(){

        this.startTime= new Date(System.currentTimeMillis());
        return this;
    }
    public  TicketBuilder  buildEndTime(Date endTime){

        this.endTime= endTime;
        return this;
    }
    public  TicketBuilder  buildPaymentId(int paymentId){
        this.paymentId=paymentId;
        return this;
    }
    public  TicketBuilder  buildCustomerId(int customerId){
        this.customerId=customerId;
        return this;
    }
    public  TicketBuilder  buildVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
        return this;
    }
    public Ticket ticket(){
        return new Ticket(this);
    }
}
}

