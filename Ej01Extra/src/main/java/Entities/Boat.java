package Entities;

public class Boat {
    private String license;
    private int size;
    private int fabricationYear;

    public Boat() {
    }

    public Boat(String license, int size, int fabricationYear) {
        this.license = license;
        this.size = size;
        this.fabricationYear = fabricationYear;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
}

