package intrerfaces;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Shape rhombus = new Rhombus(4, 6);
        System.out.println("Rhombus Area: " + rhombus.getArea());
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());

        if (square instanceof Square) {
            System.out.println("Square is indeed a square!");
        } else {
            System.out.println("Square is not a square!");
        }

        Shape[] shapes = {circle, rectangle, triangle, square, rhombus};
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }

}