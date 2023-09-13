package Entities;

public class Appliances {
    protected double price;
    protected Colour colour = Colour.BLANCO;
    protected EnergyConsumption energyConsumption = EnergyConsumption.F;
    protected double weight;

    public Appliances() {}

    public Appliances(double price, Colour colour, EnergyConsumption energyConsumption, double weight) {
        this.price = price;
        this.colour = colour;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public EnergyConsumption getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(EnergyConsumption energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



}
