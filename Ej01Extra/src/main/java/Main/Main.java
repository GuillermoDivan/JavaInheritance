/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.*/

package Main;

import Entities.*;
import services.RentService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Boat b1 = new Boat("123", 20, 2010);
        Sailboat s1 = new Sailboat("456", 20, 2012, 2);
        Motorboat m1 = new Motorboat("789", 20, 2015, 200);
        DeluxeYacht d1 = new DeluxeYacht("147", 40, 2020, 200, 10);

        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(2);

        Rent r1 = new Rent("P1", "123", rentalDate, returnDate , "1", b1);
        Rent r2 = new Rent("P2", "456", rentalDate, returnDate , "1", s1);
        Rent r3 = new Rent("P3", "789", rentalDate, returnDate , "1", m1);
        Rent r4 = new Rent("P4", "147", rentalDate, returnDate , "1", d1);

        RentService service = new RentService();
        service.calculateRent(r1);
        service.calculateRent(r2);
        service.calculateRent(r3);
        service.calculateRent(r4);
    }
}
