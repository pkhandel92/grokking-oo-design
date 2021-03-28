package com.mgmt.hotel.search.service;

import com.mgmt.hotel.search.SearchRequest;
import com.mgmt.hotel.search.SearchResponse;
import com.mgmt.hotel.search.criteria.SearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteriaResponse;
import com.mgmt.hotel.search.facade.SearchFacade;
import com.mgmt.hotel.search.facade.SearchFacadeFactory;
import com.mgmt.hotel.search.service.ISearchService;

public class SearchServiceImpl implements ISearchService {

    @Override
    public SearchResponse<SearchCriteriaResponse> search(SearchRequest<? extends SearchCriteria> criteria) {
        SearchCriteria searchCriteria=criteria.getCriteria();
        SearchFacade<SearchCriteria> searchFacade=null;
        try {
            searchFacade= SearchFacadeFactory.getSearchFacade(searchCriteria);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return searchFacade.search(searchCriteria);
    }
}
