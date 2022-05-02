package com.engeto.lekce2.projecthotel;

import java.math.BigDecimal;

public class Room {

    // ATRIBUTY
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean seaView;
    private BigDecimal price;

    // KONSTRUKTOR
    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean seaView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.seaView = seaView;
        this.price = price;
    }

    // GETTERY A SETTERY

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // GET DESCRIPTION
    public String getDescription() {
        return "Room " + roomNumber + " Beds: " + numberOfBeds + ". With balcony: " + hasBalcony +
                ". With sea view: " + seaView + ". Price for one night(CZK): " + price;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
