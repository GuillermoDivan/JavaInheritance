package Entities;

public class Motorboat extends Boat {
    private double has;

    public Motorboat(String license, int size, int fabricationYear, double has) {
        super(license, size, fabricationYear);
        this.has = has;
    }

    public double getHas() {
        return has;
    }

    public void setHas(double has) {
        this.has = has;
    }
}


