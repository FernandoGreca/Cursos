package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private double radius;


    public Circle(){
        super();
    }
    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double getRaio() {
        return radius;
    }
    public void setRaio(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
