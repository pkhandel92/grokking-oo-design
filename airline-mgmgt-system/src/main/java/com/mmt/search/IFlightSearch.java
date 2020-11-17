package com.mmt.search;

import java.util.List;

public interface IFlightSearch {
    public List<FlightSearchResponse> searchFlight(FlightSearchRequest searchRequest);
}
