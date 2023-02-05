package lesson_10.homework;

import java.util.Scanner;

public class Square extends Shape {

    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public Square() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter square color: ");
        setColor(input.next());
        System.out.print("Enter square side: ");
        do {
            side = input.nextDouble();
            if (side == 0){
                System.out.print("Square side cannot be equal zero, try again: ");
            } else if (side < 0) {
                System.out.print("Square side cannot be negative, try again: ");
            }
        } while (side <= 0);

        System.out.println("Done!");
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + side +
                "} " + super.toString();
    }
}