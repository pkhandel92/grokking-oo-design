package com.mgmt.hotel.search.facade;

import com.mgmt.hotel.search.criteria.HotelSearchCriteria;
import com.mgmt.hotel.search.criteria.RoomSearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteria;

public class SearchFacadeFactory {
    private SearchFacadeFactory(){}
    private static HoteSearchFacade hotelSearchFacade;
    private static RoomSearchFacade roomSearchFacade;

    public static void setHotelSearchFacade(HoteSearchFacade hotelSearchFacade) {
        SearchFacadeFactory.hotelSearchFacade = hotelSearchFacade;
    }

    public void setRoomSearchFacade(RoomSearchFacade roomSearchFacade) {
        this.roomSearchFacade = roomSearchFacade;
    }

    public static SearchFacade getSearchFacade(SearchCriteria searchCriteria) throws Exception {
        if(searchCriteria instanceof HotelSearchCriteria)
            return hotelSearchFacade;
        else if(searchCriteria instanceof RoomSearchCriteria)
            return roomSearchFacade;
        else
            throw new Exception("Unknown Search Criteria");
    }

}
