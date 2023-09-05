package Entities;

public abstract class Building {
    protected double tall;
    protected double wide;
    protected double deep;

    public Building() {
    }

    public Building(double tall, double wide, double deep) {
        this.tall = tall;
        this.wide = wide;
        this.deep = deep;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(double deep) {
        this.deep = deep;
    }

    public abstract double calculateArea();

    public abstract double calculateVolume();
}


