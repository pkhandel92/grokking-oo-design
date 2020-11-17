package com.mgmt.hotel.search.criteria;

import com.mgmt.hotel.room.Room;

import java.util.List;

public class RoomSearchCriteriaResponse implements SearchCriteriaResponse {
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
