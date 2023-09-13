package Service;
import Entities.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AppliancesService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Appliances> appliancesList = new ArrayList<>();

    public Appliances createAppliances() {
        System.out.println("Ingrese color del electrodoméstico");
        Colour colour = checkColour(input.next());
        System.out.println("Ingrese consumo de energía del electrodoméstico");
        EnergyConsumption energyConsumption = checkEnergyConsumption(input.next());
        System.out.println("Ingrese peso del electrodoméstico");
        double weight = input.nextDouble();
        double basePrice = 1000;
        double price = finalPrice(weight, energyConsumption) + basePrice;
        return new Appliances(price, colour, energyConsumption, weight);
    }

    public void showPriceList() {
        double total = 0;
        for (Appliances a : appliancesList) {
            System.out.println(a.getPrice());
            total += a.getPrice();
        }
        System.out.println("El valor total de los electrodomésticos es de $" + total + ".");
    }

    private EnergyConsumption checkEnergyConsumption(String letter) {
        EnergyConsumption ene = null;
        for (EnergyConsumption e : EnergyConsumption.values()) {
            ene =  e.F;
            if (letter.equalsIgnoreCase(e.name())) {
                ene = e;
                break;
            }
        } return ene;
    }

    private Colour checkColour(String colour) {
        Colour col = null;
        for (Colour c : Colour.values()) {
            col = c.BLANCO;
            if (colour.equalsIgnoreCase(c.name())) {
                col = c;
                break;
            }
        }
        return col;
    }


    public double finalPrice(double weight, EnergyConsumption energyConsumption) {
        double add1 = 0.0;
        double add2;
        switch (energyConsumption.name()) {
            case "A":
                add1 = 1000;
            case "B":
                add1 = 800;
            case "C":
                add1 = 600;
            case "D":
                add1 = 500;
            case "E":
                add1 = 300;
            case "F":
                add1 = 100;
        }
        if (weight < 20) {
            add2 = 100;
        } else if (weight > 19 && weight < 50) {
            add2 = 500;
        } else if (weight > 49 && weight < 80) {
            add2 = 800;
        } else {
            add2 = 1000;
        }
        return (add1 + add2);
    }


}
