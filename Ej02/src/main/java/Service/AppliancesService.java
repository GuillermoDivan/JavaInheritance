package Service;
import Entities.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AppliancesService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Appliances> appliancesList = new ArrayList<>();

    public Appliances createAppliances() {
        System.out.println("Ingrese color del electrodoméstico");
        String colour = checkColour(input.next());
        System.out.println("Ingrese consumo de energía del electrodoméstico");
        String energyConsumption = checkEnergyConsumption(input.next());
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
        } System.out.println("El valor total de los electrodomésticos es de $" + total + ".");
    }

    private String checkEnergyConsumption(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                return letter;
            default:
                return "F";
        }
    }

    private String checkColour(String colour) {
        switch (colour.toLowerCase()) {
            case "rojo":
            case "negro":
            case "azul":
            case "gris":
                return colour;
            default:
                return "blanco";
        }
    }

    public double finalPrice(double weight, String energyConsumption) {
        double add1 = 0.0;
        double add2;
        switch (energyConsumption.toUpperCase()) {
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

/*
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la
suma del precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora
con un precio de 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000)
para electrodomésticos, 2000 para lavadora y 5000 para televisor.*/