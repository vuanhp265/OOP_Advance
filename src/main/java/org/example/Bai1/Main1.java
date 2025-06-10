package org.example.Bai1;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Main
public class Main1 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 5);
        Shape square = new Square(6);

        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Rectangle perimeter: " + rect.perimeter());

        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
