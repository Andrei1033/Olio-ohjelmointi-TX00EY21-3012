package tasks_3_4_Shape_Hierarchy_and_Polymorphism;

public class Shape {

    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public double calculateArea(){
        return 0.0;
    }
}

class Circle extends Shape {
    private  double radius;
    public Circle(double radius,  String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle (color: " + color + ") with radius " + radius;
    }
}

class Rectangle extends Shape {
    private  double width;
    private  double height;
    public Rectangle(double height, double width,  String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return height * width;
    }
    @Override
    public String toString() {
        return "Rectangle (color: " + color + ") with width " + width + " and height " + height;
    }
}

class Triangle extends Shape {
    private  double base;
    private  double height;
    public Triangle(double base, double height,  String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (base * height) / 2;
    }
    @Override
    public String toString() {
        return "Triangle (color: " + color + ") with base " + base + " and height " + height;
    }
}