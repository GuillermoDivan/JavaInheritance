package Service;
import Entities.Appliances;
import Entities.Television;
import Entities.WashingMachine;

public class TelevisionService extends AppliancesService {

    public Television createTelevision(){
        Appliances a = createAppliances();
        System.out.println("Ingrese la resolución del televisor.");
        double resolution = input.nextDouble();
        System.out.println("Ingrese la TDT del televisor: S/N");
        boolean tdt;
        if (input.next().equalsIgnoreCase("s")){ tdt = true;} else {tdt = false;}
        Television t1 = new Television(a, resolution, tdt);
        AppliancesService.appliancesList.add(t1);
        return t1;
    }

    public double finalPrice(Television t){
        double add1 = finalPrice(t.getWeight(), t.getEnergyConsumption());
        double add2 = add1;
        double add3 = 0.0;
        if (t.getResolution() > 40){ add2 *= 0.3; }
        if (t.isTdt()){ add3 = 500; }
        return (add1 + add2 + add3);
    }

    public void showTelevision(Television t){
        System.out.println(t.toString());
    }



}
