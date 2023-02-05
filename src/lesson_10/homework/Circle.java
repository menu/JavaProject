package lesson_10.homework;

import java.util.Scanner;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public Circle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle color: ");
        setColor(input.next());
        System.out.print("Enter circle radius: ");
        do {
            radius = input.nextDouble();
            if (radius == 0) {
                System.out.print("Circle radius cannot be equal zero, try again: ");
            } else if (radius < 0) {
                System.out.print("Circle radius cannot be negative, try again: ");
            }
        } while (radius <= 0);

        System.out.println("Done!");
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                "} " + super.toString();
    }
}