package Entities;

public class Television extends Appliances {
    private double resolution;
    private boolean tdt;

    public Television(){}

    public Television(double price, Colour colour, EnergyConsumption energyConsumption, double weight, double resolution, boolean tdt) {
        super(price, colour, energyConsumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public Television(Appliances appliances, double resolution, boolean tdt){
        super(appliances.getPrice(), appliances.getColour(), appliances.getEnergyConsumption(), appliances.getWeight());
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolution=" + resolution +
                ", tdt=" + tdt +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", energyConsumption='" + energyConsumption + '\'' +
                ", weight=" + weight +
                '}';
    }
}


