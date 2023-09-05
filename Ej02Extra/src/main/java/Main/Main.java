/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
        Estos métodos serán abstractos y los implementarán las siguientes clases:
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
        Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
        • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
        por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
        los atributos del padre.
        De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
        usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */

package Main;

import Entities.Building;
import Entities.OfficeBuilding;
import Entities.Sportscenter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Building> buildingArrayList = new ArrayList<Building>();
        Sportscenter s1 = new Sportscenter(10, 50, 100, "S1", true);
        Sportscenter s2 = new Sportscenter(12, 100, 100, "S2", false);
        Sportscenter s3 = new Sportscenter(10, 50, 100, "S3", true);
        Sportscenter s4 = new Sportscenter(12, 100, 100, "S4", true);
        OfficeBuilding o1 = new OfficeBuilding(20, 40, 40, 7, 20, 7);
        OfficeBuilding o2 = new OfficeBuilding(30, 50, 50, 10, 30, 10);

        buildingArrayList.add(s1);
        buildingArrayList.add(s2);
        buildingArrayList.add(s3);
        buildingArrayList.add(s4);
        buildingArrayList.add(o1);
        buildingArrayList.add(o2);

        int sportscenterCount = 0;
        int roofedCount = 0;
        for (Building b : buildingArrayList) {
            System.out.println(b.calculateArea());
            System.out.println(b.calculateVolume());
            if (b instanceof Sportscenter) {
                sportscenterCount++;
                Sportscenter x = (Sportscenter) b;
                if (x.isRoofed()) {
                    roofedCount++;
                }
            }
            if (b instanceof OfficeBuilding) {
                OfficeBuilding x = (OfficeBuilding) b;
                System.out.println(x.totalPeople());
            }
        }
        System.out.println("Cantidad de polideportivos techados: " + roofedCount +
                " de un total de " + sportscenterCount +".");
    }
}

