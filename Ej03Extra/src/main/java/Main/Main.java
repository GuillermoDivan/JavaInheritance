/*Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */

package Main;
import Entities.*;
import Services.HotelService;
import Services.ShowInfoService;

public class Main {
    public static void main(String[] args) {
        //CREATING SEVERAL OBJECTS, CALCULATING BEDROOMP PRICE AND ADDING TO THE LIST.
        HotelService hs = new HotelService();
        FourStars h1 = new FourStars("h1", "h1", "h1", "h1", 20,
                30, 4, 0, "A", "h1",
                40 ); hs.calculateRoomPrice(h1); ShowInfoService.accList.add(h1);
        FourStars h2 = new FourStars("h2", "h2", "h2", "h2", 30,
                45, 6, 0, "A", "h1",
                50 ); hs.calculateRoomPrice(h2); ShowInfoService.accList.add(h2);
        FourStars h3 = new FourStars("h3", "h3", "h3", "h3", 40,
                55, 8, 0, "B", "h3",
                60 ); hs.calculateRoomPrice(h3); ShowInfoService.accList.add(h3);
        FourStars h4 = new FourStars("h4", "h4", "h4", "h4", 30,
                70, 10, 0, "B", "h4",
                70 ); hs.calculateRoomPrice(h4); ShowInfoService.accList.add(h4);
        FiveStars h5 = new FiveStars("h5", "h5", "h5", "h5", 20,
                30, 4, 0, "A", "h5",
                40, 1, 5, 2 );
        hs.calculateRoomPrice(h5); ShowInfoService.accList.add(h5);
        FiveStars h6 = new FiveStars("h6", "h6", "h6", "h6", 30,
                50, 8, 0, "A", "h6",
                60, 1, 15, 3 );
        hs.calculateRoomPrice(h6); ShowInfoService.accList.add(h6);
        FiveStars h7 = new FiveStars("h7", "h7", "h7", "h7", 40,
                80, 10, 0, "B", "h7",
                80, 2, 20, 4 );
        hs.calculateRoomPrice(h7); ShowInfoService.accList.add(h7);
        FiveStars h8 = new FiveStars("h8", "h8", "h8", "h8", 30,
                100, 12, 0, "B", "h8",
                100, 2, 20, 8 );
        hs.calculateRoomPrice(h8); ShowInfoService.accList.add(h8);
        Camping c1 = new Camping("c1", "c1", "c1", "c1", false,
                100, 20, 10, false);
        ShowInfoService.accList.add(c1);
        Camping c2 = new Camping("c2", "c2", "c2", "c2", false,
                150, 30, 20, true);
        ShowInfoService.accList.add(c2);
        Camping c3 = new Camping("c3", "c3", "c3", "c3", true,
                200, 45, 20, true);
        ShowInfoService.accList.add(c3);
        Camping c4 = new Camping("c4", "c4", "c4", "c4", true,
                300, 60, 30, true);
        ShowInfoService.accList.add(c4);
        Residential r1 = new Residential("r1", "r1", "r1", "r1", true,
                60, 1, false, false);
        ShowInfoService.accList.add(r1);
        Residential r2 = new Residential("r2", "r2", "r2", "r2", false,
                80, 2, true, false);
        ShowInfoService.accList.add(r2);
        Residential r3 = new Residential("r3", "r3", "r3", "r3", true,
                100, 2, false, true);
        ShowInfoService.accList.add(r3);
        Residential r4 = new Residential("r4", "r4", "r4", "r4", true,
                100, 3, true, true);
        ShowInfoService.accList.add(r4);

        //TESTING METHODS.
        ShowInfoService service = new ShowInfoService();
        System.out.println("Mostrando todos los alojamientos");
        service.showAllAccommodations();
        System.out.println("**********************");
        System.out.println("Mostrando hoteles en precio por habitación descendente");
        service.showHotelsDesc();
        System.out.println("**********************");
        System.out.println("Mostrando campings con restaurant");
        service.showCampingsWRestaurant();
        System.out.println("**********************");
        System.out.println("Mostrando residenciales con descuento");
        service.showResidentialWDiscount();

    }
}
