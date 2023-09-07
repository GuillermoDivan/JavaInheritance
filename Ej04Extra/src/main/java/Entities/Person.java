package Entities;

import java.util.Scanner;

public abstract class Person {
    protected String name;
    protected String surname;
    protected String dni;
    protected MaritalStatus maritalStatus;

    public Person() {
    }

    public Person(String name, String surname, String dni, MaritalStatus maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Nombre(s) y apellido(s): " + name + surname +
                ". DNI: " + dni + ". Estado civil: " + maritalStatus + ".";
    }

    public void changeMaritalStatus() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Presione el número correspondiente al nuevo estado civil. 1) Solterx. 2) Casadx." +
                "3) Viudx. 4) Divorciadx.");
        switch (input.nextInt()) {
            case 1: setMaritalStatus(MaritalStatus.valueOf("Solterx"));
                break;
            case 2: setMaritalStatus(MaritalStatus.valueOf("Casadx"));
                break;
            case 3: setMaritalStatus(MaritalStatus.valueOf("Viudx"));
                break;
            case 4: setMaritalStatus(MaritalStatus.valueOf("Divorciadx"));
                break;
            default:
                System.out.println("Opción incorrecta, vuelva a iniciar.");
                break;
        }
    }
}

