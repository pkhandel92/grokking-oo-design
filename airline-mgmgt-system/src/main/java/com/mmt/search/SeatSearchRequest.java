package com.mmt.search;

import com.mmt.model.FLightype;
import com.mmt.model.Seat;

import java.util.List;

public class SeatSearchRequest {
    public List<Seat> seatList;
    public String flightNo;
    private FLightype fLightype;

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public FLightype getfLightype() {
        return fLightype;
    }

    public void setfLightype(FLightype fLightype) {
        this.fLightype = fLightype;
    }
}
