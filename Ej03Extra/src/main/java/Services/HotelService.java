package Services;

import Entities.FiveStars;
import Entities.Hotel;

public class HotelService {

    public double calculateRoomPrice(Hotel hotel){
        double price = 50 + (hotel.getBedsAmount() * hotel.getRoomsAmount()) + (restaurantExtra(hotel))
                + (gymExtra(hotel));
        if (hotel instanceof FiveStars) { price += limousineExtra(hotel); }
            hotel.setBedroomPrice(price);
                return price;
    }

    public double restaurantExtra(Hotel hotel){
        if (hotel.getRestaurantCapacity() < 30){ return 10;}
        else if (hotel.getRestaurantCapacity() > 29 && hotel.getRestaurantCapacity() < 50) { return 30; }
        else {return 50; }
    }

    public double gymExtra(Hotel hotel){
        if (hotel.getGym().toString().equalsIgnoreCase("A")){ return 50; } else { return 30; }
    }

    public double limousineExtra(Hotel hotel){
        double price = 0;
        if (hotel instanceof FiveStars) { price = 15 * ((FiveStars) hotel).getLimoAmount() * 15; }
        return price;
    }


}

