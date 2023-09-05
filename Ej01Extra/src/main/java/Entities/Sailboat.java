package Entities;

public class Sailboat extends Boat {
    private int Pole;

    public Sailboat(String license, int size, int fabricationYear, int pole) {
        super(license, size, fabricationYear);
        Pole = pole;
    }

    public int getPole() {
        return Pole;
    }

    public void setPole(int pole) {
        Pole = pole;
    }
}
