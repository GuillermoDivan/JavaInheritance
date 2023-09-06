package Service;
import Entities.Appliances;
import Entities.WashingMachine;


public class WashingMachineService extends AppliancesService {

    public WashingMachine createWashingMachine(){
        Appliances a =  createAppliances();
        System.out.println("Ingrese la carga permitida en el lavarropas.");
        WashingMachine w1 = new WashingMachine(a, input.nextDouble());
        AppliancesService.appliancesList.add(w1);
        return w1;
    }

    public double finalPrice(WashingMachine w){
        double add2 = 0.0;
        double add1 = finalPrice(w.getWeight(), w.getEnergyConsumption());
        if (w.getCharge() > 30){ add2 = 500; }
        return (add1 + add2);
    }

    public void showWashingMachine(WashingMachine w){
        System.out.println(w.toString());
    }
}


