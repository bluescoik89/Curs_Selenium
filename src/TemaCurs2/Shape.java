package TemaCurs2;

public class Shape {

    public Shape(int length) {
        calculateSquareArea(length);

    }

    public Shape(int length, int width) {
        calculateRectangleArea(length, width);
    }

    public Shape(double radius) {
        double circle = radius * radius * Math.PI;
        System.out.println("The area of the circle is: " + circle);
    }

    public void calculateSquareArea(int length) {
        int square = length * length;
        System.out.println("The area of the square is: " + square);
    }

    public void calculateRectangleArea(int length, int width) {
        int rectangle = length * width;
        System.out.println("The area of the rectangle is: " + rectangle);
    }


}
