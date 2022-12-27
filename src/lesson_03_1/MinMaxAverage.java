package lesson_03_1;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        //variable declaration
        double a, b, c, min, max, average;
        Scanner scanner = new Scanner(System.in);

        //code
        System.out.print("Enter first number: ");
        a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        c = scanner.nextDouble();
        scanner.close();
        System.out.println("------------");
        average = (a + b + c) / 3;
        System.out.println(average + " is average");

        max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println(max + " is max number");

        min = (a > b) ? a : b;
        min = (min > c) ? min : c;
        System.out.println(min + " is min number");


    }
}
