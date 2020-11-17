package com.mmt.search;

import com.mmt.model.Seat;

import java.util.Map;

public class SeatSearchResponse {
    private Map<Seat,SeatStatus> status;
    private String rcode;
    private String rMessage;

    public Map<Seat, SeatStatus> getStatus() {
        return status;
    }

    public void setStatus(Map<Seat, SeatStatus> status) {
        this.status = status;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getrMessage() {
        return rMessage;
    }

    public void setrMessage(String rMessage) {
        this.rMessage = rMessage;
    }

}
