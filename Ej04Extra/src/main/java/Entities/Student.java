package Entities;

import java.util.Scanner;

public final class Student extends Person {
    private String course;

    public Student() {
    }

    public Student(String name, String surname, String dni, MaritalStatus maritalStatus, String course) {
        super(name, surname, dni, maritalStatus);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + " Curso actual: " + course + ".";
    }

    public void enrollToCourse(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nuevo curso para estudiante " + getName()+
                " "+ getSurname());
        setCourse(input.next());
    }
}


