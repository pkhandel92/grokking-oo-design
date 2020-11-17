package com.mgmt.hotel.search;

import com.mgmt.hotel.search.criteria.SearchCriteriaResponse;

public class SearchResponse<T extends SearchCriteriaResponse> {
    private long requestId;
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }
}
