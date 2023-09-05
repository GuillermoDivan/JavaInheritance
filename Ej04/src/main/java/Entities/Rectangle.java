package Entities;

public class Rectangle implements ShapeCalculus{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("prueba de que se puede acceder a Pi en el rectángulo:" + pi);
        var p = (base+height)*2;
        System.out.println(p);
        return p;
    }

    @Override
    public double calculateArea() {
        var p = base*height;
        System.out.println(p);
        return p;
    }

}
