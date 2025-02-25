package com.l;


public class TestLSP {
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        printArea(rectangle);

        Shape square = new Square(4);
        printArea(square);
    }
}
