package lesson_10.homework;

import java.util.Scanner;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rectangle color: ");
        setColor(input.next());
        System.out.print("Enter rectangle width: ");
        do {
            width = input.nextDouble();
            if (width == 0) {
                System.out.print("Rectangle width cannot be equal zero, try again: ");
            } else if (width < 0) {
                System.out.print("Rectangle width cannot be negative, try again: ");
            }
        } while (width <= 0);

        System.out.print("Enter rectangle height: ");
        do {
            height = input.nextDouble();
            if (height == 0) {
                System.out.print("Rectangle height cannot be equal zero, try again: ");
            } else if (height < 0) {
                System.out.print("Rectangle height cannot be negative, try again: ");
            }
        } while (height <= 0);

        System.out.println("Done!");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "sideA=" + width +
                ", sideB=" + height +
                "} " + super.toString();
    }
}