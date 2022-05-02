package com.engeto.lekce2.projecthotel;

import java.time.LocalDate;

public class Guest {

    //ATRIBUTY
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    //KONSTRUKTOR

    public Guest(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    //GETTERY A SETTERY

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    // GET DESCRIPTION
    public String getDescription() {
        return "The name is: " + name + " " + surname + ". Date of birth is: " + dateOfBirth;
    }
    public String getGuestFullName() {
        return getName() + " " + getSurname();
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
