package com.step;

public class Square extends Shape {

    public Square(int side) {
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double surface() {
        return side * side;
    }
}
