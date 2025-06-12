package org.example.Bai1;

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
