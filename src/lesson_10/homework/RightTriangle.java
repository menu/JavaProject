package lesson_10.homework;

import java.util.Scanner;

public class RightTriangle extends Shape {

    private double side;

    public RightTriangle(String color, double side){
        super(color);
        this.side = side;
    }

    public RightTriangle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter right triangle color: ");
        setColor(input.next());
        System.out.print("Enter right triangle side: ");
        do {
            side = input.nextDouble();
            if (side == 0){
                System.out.print("Right triangle side cannot be equal zero, try again: ");
            } else if (side < 0) {
                System.out.print("Right triangle side cannot be negative, try again: ");
            }
        } while (side <= 0);

        System.out.println("Done!");
    }


    @Override
    public double calculatePerimeter() {
        return side * 3;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2) * Math.sqrt(3/4);
    }

    @Override
    public String toString() {
        return "RightTriangle {" +
                "side=" + side +
                "} " + super.toString();
    }
}