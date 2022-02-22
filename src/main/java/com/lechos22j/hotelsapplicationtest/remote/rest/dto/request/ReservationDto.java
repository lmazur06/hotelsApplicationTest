package com.lechos22j.hotelsapplicationtest.remote.rest.dto.request;

import com.lechos22j.hotelsapplicationtest.remote.rest.dto.common.PersonDto;
import com.lechos22j.hotelsapplicationtest.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private List<RoomReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationDto(List<RoomReservationDto> roomsReservation, PersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public List<RoomReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
