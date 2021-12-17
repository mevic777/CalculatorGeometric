package com.step;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double surface() {
        return length * width;
    }
}
