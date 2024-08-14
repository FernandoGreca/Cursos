package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    
    public Rectangle(){
        super();
    }
    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    public double getBase() {
        return width;
    }
    public void setBase(double width) {
        this.width = width;
    }
    public double getAltura() {
        return height;
    }
    public void setAltura(double height) {
        this.height = height;
    }


    @Override
    public double area(){
        return width * height;
    }
}
