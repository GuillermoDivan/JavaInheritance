package Entities;

public class Sportscenter extends Building{
    private String name;
    private boolean roofed;

    public Sportscenter(double tall, double wide, double deep, String name, boolean roofed) {
        super(tall, wide, deep);
        this.name = name;
        this.roofed = roofed;
    }

    @Override
    public double calculateArea() {
        System.out.println("Esto fue sobreescrito en la clase a pedido de la consigna. Ambos métodos sobreescritos son iguales...");
        System.out.println("Área polideportivo: ");
        return wide * deep;
    }

    @Override
    public double calculateVolume() {
        System.out.println("Esto fue sobreescrito en la clase a pedido de la consigna. Ambos métodos sobreescritos son iguales...");
        System.out.println("Volumen polideportivo: ");
        return wide * deep * tall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoofed() {
        return roofed;
    }

    public void setRoofed(boolean roofed) {
        this.roofed = roofed;
    }
}
