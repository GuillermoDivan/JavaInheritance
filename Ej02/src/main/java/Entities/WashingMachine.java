package Entities;

public final class WashingMachine extends Appliances{
    private double charge;

    public WashingMachine() {}

    public WashingMachine(double price, Colour colour, EnergyConsumption energyConsumption, double weight, double charge) {
        super(price, colour, energyConsumption, weight);
        this.charge = charge;
    }

    public WashingMachine(Appliances appliances, double charge){
        super(appliances.getPrice(), appliances.getColour(), appliances.getEnergyConsumption(), appliances.getWeight());
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "charge=" + charge +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", energyConsumption='" + energyConsumption + '\'' +
                ", weight=" + weight +
                '}';
    }
}
