package com.mgmt.hotel.search.facade;

import com.mgmt.hotel.hotel.Hotel;
import com.mgmt.hotel.search.criteria.HotelSearchCriteria;
import com.mgmt.hotel.search.criteria.HotelSearchCriteriaResponse;
import com.mgmt.hotel.search.criteria.SearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteriaResponse;
import com.mgmt.hotel.search.SearchResponse;
import com.mgmt.hotel.search.dao.SearchDaoImpl;

import java.util.List;

public class HoteSearchFacade implements SearchFacade<HotelSearchCriteria>{
    private SearchDaoImpl hotelDao;

    public SearchDaoImpl getHotelDao() {
        return hotelDao;
    }

    public void setHotelDao(SearchDaoImpl hotelDao) {
        this.hotelDao = hotelDao;
    }

    @Override
    public SearchResponse<SearchCriteriaResponse> search(HotelSearchCriteria criteria) {
        List<Hotel> hotels=hotelDao.searchHotels(criteria);
        HotelSearchCriteriaResponse response=new HotelSearchCriteriaResponse();
        response.setHotels(hotels);
        SearchResponse<SearchCriteriaResponse> searchResponse=new SearchResponse<SearchCriteriaResponse>();
        searchResponse.setT(response);
        return searchResponse;
    }
}
