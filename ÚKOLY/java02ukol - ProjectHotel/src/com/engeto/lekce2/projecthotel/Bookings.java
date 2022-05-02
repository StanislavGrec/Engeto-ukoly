package com.engeto.lekce2.projecthotel;

import java.time.LocalDate;

public class Bookings {

    //ATRIBUTY (??? vratit atribut private int reservationNumber)
    private int room;
    private String guest;
    private LocalDate checkIn;
    private LocalDate checkOut;


    // KONSTRUKTOR

    public Bookings(int room, String guest, LocalDate checkIn, LocalDate checkOut) {
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    // GETTERY A SETTERY

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }


    // GET DESCRIPTION

    public String getDescription() {
        return "Guest in the room: " + guest + ", the person/s is/are in the room number " + room +". Check-in date is: " + checkIn +
                ". Check-out date is: " + checkOut + ".";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
