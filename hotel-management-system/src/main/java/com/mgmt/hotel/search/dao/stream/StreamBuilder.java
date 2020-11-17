package com.mgmt.hotel.search.dao.stream;

import com.mgmt.hotel.hotel.Hotel;

import java.util.stream.Stream;

public interface StreamBuilder<T> {
    default StreamBuilder<Hotel> filter(Stream<Hotel> stream, String category, String filter){return null;}
    default StreamBuilder<Hotel> filter(Stream<Hotel> stream, Integer category,String filter){return null;}
    public Stream<T> build();
}
