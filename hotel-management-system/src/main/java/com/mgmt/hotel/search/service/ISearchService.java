package com.mgmt.hotel.search.service;

import com.mgmt.hotel.search.SearchRequest;
import com.mgmt.hotel.search.SearchResponse;
import com.mgmt.hotel.search.criteria.SearchCriteria;
import com.mgmt.hotel.search.criteria.SearchCriteriaResponse;

public interface ISearchService {
    public SearchResponse<SearchCriteriaResponse> search(SearchRequest<? extends SearchCriteria> criteria);
}
