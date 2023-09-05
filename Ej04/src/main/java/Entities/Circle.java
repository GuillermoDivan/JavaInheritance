package Entities;

public class Circle implements ShapeCalculus{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        var p = pi * (radius*2);
        System.out.println(p);
        return p;
    }

    @Override
    public double calculateArea() {
        var p = pi * Math.pow(radius,2);
        System.out.println(p);
        return p;
    }
}

