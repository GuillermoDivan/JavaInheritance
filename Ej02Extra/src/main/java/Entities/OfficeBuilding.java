package Entities;

public class OfficeBuilding extends Building{
    private int officesAmount;
    private int peoplePerOffice;
    private int floors;

    public OfficeBuilding(double tall, double wide, double deep, int officesAmount, int peoplePerOffice, int floors) {
        super(tall, wide, deep);
        this.officesAmount = officesAmount;
        this.peoplePerOffice = peoplePerOffice;
        this.floors = floors;
    }
    @Override
    public double calculateArea() {
        System.out.println("Esto fue sobreescrito en la clase a pedido de la consigna. Ambos métodos sobreescritos son iguales...");
        System.out.println("Área oficina: ");
        return wide * deep;
    }

    @Override
    public double calculateVolume() {
        System.out.println("Esto fue sobreescrito en la clase a pedido de la consigna. Ambos métodos sobreescritos son iguales...");
        System.out.println("Volumen oficina: ");
        return wide * deep * tall;
    }

    public int totalPeople(){
        System.out.println("Se supone que debe multiplicarse también por número de pisos pero resulta que, si es una oficina por piso "+
                "como plantea el enunciado, dicha información se vuelve redundante. :) ");
        int total = peoplePerOffice * officesAmount;
        return total;
    }

}



