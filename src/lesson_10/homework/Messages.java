package lesson_10.homework;

import java.util.List;
import java.util.Scanner;

public class Messages {
    public static void printMainMenu() {

        System.out.println("\nPlease choose operation from menu:");
        System.out.println("1. Add new shape");
        System.out.println("2. List all shapes");
        System.out.println("3. Sum all perimeters");
        System.out.println("4. Sum all areas");
        System.out.println("5. Find the biggest perimeter");
        System.out.println("6. Find the biggest area");
        System.out.println("7. Exit");
        System.out.print("Your choice is: ");
    }

    public static int getMainMenuOption() {
        Scanner input = new Scanner(System.in);

        int option = input.nextInt();
        while (option < 1 || option > 7) {
            System.out.print("Wrong menu option, try again: ");
            option = input.nextInt();

        }
        return option;
    }

    public static void printShapesMenu() {
        System.out.println("\nPlease choose from the next Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
        System.out.print("Your choice is: ");
    }

    public static int getShapesMenuOption() {
        Scanner input = new Scanner(System.in);

        int option = input.nextInt();
        while (option < 1 || option > 4) {
            System.out.print("Wrong menu option, try again: ");
            option = input.nextInt();

        }
        return option;
    }


    public static void printCollection(List<Shape> list) {

        if (list.size() == 0) {
            System.out.println("There are no shapes in list");
            return;
        }
        list.forEach(System.out::println);
    }

    public static void printSumAllPerimeters(List<Shape> collection) {
        double sum = 0;
        if (collection.size() == 0) {
            System.out.println("Add new shape at first!");
            return;
        } else {
            for (Shape shape : collection) {
                sum += shape.calculatePerimeter();
            }
        }
        System.out.println("\nSum all shapes perimeters is " + sum);
    }

    public static void printSumAllAreas(List<Shape> collection) {
        double sum = 0;
        if (collection.size() == 0) {
            System.out.println("Add new shape at first!");
            return;
        } else {
            for (Shape shape : collection) {
                sum += shape.calculateArea();
            }
        }
        System.out.println("\nSum all shapes areas is " + sum);
    }

    public static void printBiggestPerimeter(List<Shape> collection) {
        double maxPerimeter = Double.MIN_VALUE;
        if (collection.size() == 0) {
            System.out.println("Add new shape at first!");
            return;
        } else {
            for (Shape shape : collection) {
                if (shape.calculatePerimeter() > maxPerimeter) {
                    maxPerimeter = shape.calculatePerimeter();
                }
            }
        }

        System.out.println("Biggest perimeter of all shapes is " + maxPerimeter);
    }

    public static void printBiggestArea(List<Shape> collection) {
        double maxArea = Double.MIN_VALUE;
        if (collection.size() == 0) {
            System.out.println("Add new shape at first!");
            return;
        } else {
            for (Shape shape : collection) {
                if (shape.calculateArea() > maxArea) {
                    maxArea = shape.calculateArea();
                }
            }
        }

        System.out.println("Biggest area of all shapes is " + maxArea);
    }
}

