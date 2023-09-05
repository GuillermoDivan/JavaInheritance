package Entities;

import java.time.LocalDate;

public class Rent {
    private String name;
    private String dni;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private String mooringPosition;
    private Boat boat;

    public Rent(String name) {
        this.name = name;
    }

    public Rent(String name, String dni, LocalDate rentalDate, LocalDate returnDate, String mooringPosition, Boat boat) {
        this.name = name;
        this.dni = dni;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.boat = boat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(String mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Boat getBoatType() {
        return boat;
    }

    public void setBoatType(Boat boat) {
        this.boat = boat;
    }
}

