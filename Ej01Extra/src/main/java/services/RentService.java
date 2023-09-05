package services;

import Entities.DeluxeYacht;
import Entities.Motorboat;
import Entities.Rent;
import Entities.Sailboat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentService {

    public double calculateRent(Rent rent){
        int daysRented = calculateDays(rent.getRentalDate(), rent.getReturnDate());
        int module = rent.getBoatType().getSize() * 10;
        double extra = 0;
        if (rent.getBoatType() instanceof Sailboat){ extra = ((Sailboat) rent.getBoatType()).getPole(); }
        if (rent.getBoatType() instanceof Motorboat){ extra = ((Motorboat) rent.getBoatType()).getHas(); }
        if (rent.getBoatType() instanceof DeluxeYacht){ extra = ((DeluxeYacht) rent.getBoatType()).getHas()
                + ((DeluxeYacht) rent.getBoatType()).getStaterooms(); }
        double finalPrice = (daysRented * module) + extra;
        System.out.println("El precio final por el alquiler del " + rent.getBoatType().getClass().getSimpleName() + " es de $" + finalPrice);
        return finalPrice;
    }

    public int calculateDays(LocalDate start, LocalDate end){
        return (int) start.until(end, ChronoUnit.DAYS);
    }
}