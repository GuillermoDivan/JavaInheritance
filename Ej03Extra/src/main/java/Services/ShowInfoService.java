package Services;
import Entities.*;
import java.util.ArrayList;
import java.util.Collections;

public class ShowInfoService {
    public static ArrayList<Accommodation> accList = new ArrayList<Accommodation>();

    public void showAllAccommodations(){
        System.out.print(accList.toString());
        System.out.println();
    }

    public void showHotelsDesc(){
        ArrayList<Hotel> hotelList = new ArrayList<>();
        for (Accommodation h : accList){
            if (h instanceof Hotel){
                hotelList.add((Hotel) h);
            }
        }
        Collections.sort(hotelList, (h1, h2) -> Double.compare(h2.getBedroomPrice(),
                h1.getBedroomPrice()));
        System.out.print(hotelList.toString());
        System.out.println();
    }

    public void showCampingsWRestaurant(){
        for (Accommodation c : accList){
            if (c instanceof Camping){
                if (((Camping) c).hasRestaurant()){
                    System.out.println(c.toString());
                }
            }
        }
    }

    public void showResidentialWDiscount(){
        for (Accommodation r : accList){
            if (r instanceof Residential){
                if (((Residential) r).isUnionDiscount()){
                    System.out.println(r.toString());
                }
            }
        }
    }

    }

