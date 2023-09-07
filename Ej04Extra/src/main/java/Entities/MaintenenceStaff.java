package Entities;

import java.util.Scanner;

public final class MaintenenceStaff extends Employee {
    private String area;

    public MaintenenceStaff() {
    }

    public MaintenenceStaff(String name, String surname, String dni, MaritalStatus maritalStatus,
                            int joiningYear, int officeNumber, String area) {
        super(name, surname, dni, maritalStatus, joiningYear, officeNumber);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + " . Area: " + area + ".";
    }


    public void changeArea(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la nueva sección para servicio " + getName()+
                " "+ getSurname());
        setArea(input.next());
    }
}
