package Entities;

public class DeluxeYacht extends Motorboat{
    private int staterooms;

    public DeluxeYacht(String license, int size, int fabricationYear, double has, int staterooms) {
        super(license, size, fabricationYear, has);
        this.staterooms = staterooms;
    }

    public int getStaterooms() {
        return staterooms;
    }

    public void setStaterooms(int staterooms) {
        this.staterooms = staterooms;
    }
}


