/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/

package Main;

import Entities.*;

public class Main {
    public static void main(String[] args) {
    Animal dog1 = new Dog("Stich", "Carnívoro", 15, "Doberman");
    Animal dog2 = new Dog("Teddy", "Croquetas", 10, "Chihuahua");
    Animal cat1 = new Cat("Pelusa", "Galletas", 15, "Siamés");
    Animal horse1 = new Horse("Spark", "Pasto", 25, "Fino");

    dog1.showFoodSource();
    dog2.showFoodSource();
    cat1.showFoodSource();
    horse1.showFoodSource();
    }
}
