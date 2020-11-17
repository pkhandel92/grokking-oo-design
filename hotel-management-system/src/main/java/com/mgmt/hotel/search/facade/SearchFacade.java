package com.mgmt.hotel.search.facade;

import com.mgmt.hotel.search.criteria.SearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteriaResponse;
import com.mgmt.hotel.search.SearchResponse;

public interface SearchFacade<E extends SearchCriteria> {
    public SearchResponse<SearchCriteriaResponse> search(E criteria);
}
