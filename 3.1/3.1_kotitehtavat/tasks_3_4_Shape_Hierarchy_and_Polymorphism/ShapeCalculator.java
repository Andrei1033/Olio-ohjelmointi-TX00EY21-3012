package tasks_3_4_Shape_Hierarchy_and_Polymorphism;

public class ShapeCalculator {
    public static void main(String[] args) {

        System.out.println("Shape Calculator\n");

        Shape[] shapes = {
                new Circle(5.0, "red"),
                new Rectangle(4.0, 6.0, "black"),
                new Triangle(3.0, 8.0, "blue"),
        };

        /*
        Shape[] shapes2 = {
                new Circle(55.0, "white"),
                new Rectangle(94.0, 66.0, "yellow"),
                new Triangle(39.0, 86.0, "green"),
        };*/

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }

        /*
        for (Shape shape : shapes2) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }*/
    }
}
