package com.mgmt.hotel.search.facade;

import com.mgmt.hotel.room.Room;
import com.mgmt.hotel.search.criteria.*;
import com.mgmt.hotel.search.SearchResponse;
import com.mgmt.hotel.search.dao.SearchDao;

import java.util.List;

public class RoomSearchFacade implements SearchFacade<RoomSearchCriteria>{
    private SearchDao searchDao;

    public SearchDao getSearchDao() {
        return searchDao;
    }

    public void setSearchDao(SearchDao searchDao) {
        this.searchDao = searchDao;
    }

    @Override
    public SearchResponse<SearchCriteriaResponse> search(RoomSearchCriteria criteria) {
        List<Room> rooms=searchDao.searchRooms(criteria);
        RoomSearchCriteriaResponse roomResponse=new RoomSearchCriteriaResponse();
        roomResponse.setRooms(rooms);
        SearchResponse<SearchCriteriaResponse> response=new SearchResponse<SearchCriteriaResponse>();
        response.setT(roomResponse);
        return response;
    }
}
