package lesson_04.homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        number = input.nextInt();

        if (number >= 0 && number <= 14){
            System.out.println("Number " + number + " belongs to [0,14] interval");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Number " + number + " belongs to [15,35] interval");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Number " + number + " belongs to [36,50] interval");
        } else if (number >= 50 && number <= 100) {
            System.out.println("Number " + number + " belongs to [50,100] interval");
        }
        else {
            System.out.println("Number " + number + " is out known intervals");
        }

        input.close();
    }
}
