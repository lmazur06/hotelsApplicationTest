package com.lechos22j.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelsDto {
    private List<HotelDto> hotels;

    public HotelsDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
