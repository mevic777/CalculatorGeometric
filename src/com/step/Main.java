package com.step;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce-ti valori pentru figuri: ");

        int side = scanner.nextInt();
        int sideRectangleOnly = scanner.nextInt();

        Circle circle = new Circle(side);
        System.out.println("1. Perimetrul = " + circle.perimeter() + " Aria = " + circle.surface());

        Square square = new Square(side);
        System.out.println("2. Perimetrul = " + square.perimeter() + " Aria = " + square.surface());

        Rectangle rectangle = new Rectangle(side, sideRectangleOnly);
        System.out.println("3. Perimetrul = " + rectangle.perimeter() + " Aria = " + rectangle.surface());

    }
}
