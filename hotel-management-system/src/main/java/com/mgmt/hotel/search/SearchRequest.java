package com.mgmt.hotel.search;

import com.mgmt.hotel.search.criteria.SearchCriteria;

public class SearchRequest <T extends SearchCriteria>{
    private T criteria;
    private long requestId;

    public T getCriteria() {
        return criteria;
    }

    public void setCriteria(T criteria) {
        this.criteria = criteria;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }
}
