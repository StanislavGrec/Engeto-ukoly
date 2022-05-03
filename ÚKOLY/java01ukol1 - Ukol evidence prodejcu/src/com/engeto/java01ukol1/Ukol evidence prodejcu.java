package com.engeto.java01ukol1;

import java.time.LocalDate;

class Main { // z neznámeho důvodu public class zčervenala, tak jsem to smazal public

    public static void main(String[] args) {
	String fullName = "Jan Novak";
    LocalDate dateOfBirth = LocalDate.of(1990, 10, 7 );
    int numberOfInvoices = 14;
    double soldInTones = 2.1;
    String city = "Prague";
    String carRegistrationPlate = "4Z1 4562";
    double gasMillagePerHundredKm = 5.8;
    String ipV4Address = "192.168.1.3";

        double average = (soldInTones / numberOfInvoices);
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je " + average);
    }
}
