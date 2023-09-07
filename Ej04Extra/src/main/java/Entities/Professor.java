package Entities;

import java.util.Scanner;

public final class Professor extends Employee {
    private String department;

    public Professor() {
    }

    public Professor(String name, String surname, String dni, MaritalStatus maritalStatus,
                     int joiningYear, int officeNumber, String department) {
        super(name, surname, dni, maritalStatus, joiningYear, officeNumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " Departamento: " + department + ".";
    }

    public void changeDepartment(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nuevo departamento para le docente " + getName()+
                " "+ getSurname());
       setDepartment(input.next());
    }

}


