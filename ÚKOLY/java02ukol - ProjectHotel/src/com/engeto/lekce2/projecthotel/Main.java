package com.engeto.lekce2.projecthotel;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // HOSTÉ
        Guest adelaMalikova = new Guest(
                "Adéla", "Maliková", LocalDate.of(1993,3,13));

        Guest janDvoracek = new Guest(
                "Jan", "Dvořáček", LocalDate.of(1995,5,5));

        // SEZNAM HOSTŮ
        List<Guest> guestList = new ArrayList<>();
        guestList.add(adelaMalikova);
        guestList.add(janDvoracek);
        System.out.println(guestList);

        // POKOJE
        Room room1 = new Room(
                1, 1, true, true, BigDecimal.valueOf(1000)
        );
        Room room2 = new Room(
                2, 1, true, true, BigDecimal.valueOf(1000)
        );
        Room room3 = new Room(
                3, 3, false, true, BigDecimal.valueOf(2400)
        );

        // SEZNAM POKOJŮ
        List<Room> roomsList = new ArrayList<>();
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);
        System.out.println(roomsList);

        // REZERVACE
        Bookings booking1 = new Bookings(1, adelaMalikova.getName(),
                LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Bookings booking2 = new Bookings(3, adelaMalikova.getName() + " and " + janDvoracek.getName(),
                LocalDate.of(2021,9,3),LocalDate.of(2021,9,14));


        // SEZNAM REZERVACÍ
        List<Bookings> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);
        System.out.println(bookingList);

    }
}
