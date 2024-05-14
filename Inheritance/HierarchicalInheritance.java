package Inheritance;
// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}


class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}


class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
