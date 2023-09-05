package Entities;

public class Appliances {
    protected double price;
    protected String colour;
    protected String energyConsumption;
    protected double weight;

    public Appliances() {}

    public Appliances(double price, String colour, String energyConsumption, double weight) {
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



}
