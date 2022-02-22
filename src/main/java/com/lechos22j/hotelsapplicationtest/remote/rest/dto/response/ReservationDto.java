package com.lechos22j.hotelsapplicationtest.remote.rest.dto.response;

import com.lechos22j.hotelsapplicationtest.domain.model.ReservationStatusType;
import com.lechos22j.hotelsapplicationtest.remote.rest.dto.common.PersonDto;
import com.lechos22j.hotelsapplicationtest.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomReservationDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
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
