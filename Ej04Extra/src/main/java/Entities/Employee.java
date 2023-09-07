package Entities;

import java.util.Scanner;

public abstract class Employee extends Person {
    protected int joiningYear;
    protected int officeNumber;

    public Employee() {
    }

    public Employee(String name, String surname, String dni, MaritalStatus maritalStatus,
                    int joiningYear, int officeNumber) {
        super(name, surname, dni, maritalStatus);
        this.joiningYear = joiningYear;
        this.officeNumber = officeNumber;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " Año de inicio actividades: " + joiningYear +
                ". Número de despacho: " + officeNumber + ".";
    }

    public void resetOfficeNumber(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nuevo despacho para empleadx " + getName()+
                " "+ getSurname());
        setOfficeNumber(input.nextInt());
    }

}

