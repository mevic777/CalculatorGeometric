package com.step;


public class Circle extends Shape {

    public Circle(int side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 2 * side * 3.14;
    }

    public double surface() {
        return 3.14 * side * side;
    }
}
