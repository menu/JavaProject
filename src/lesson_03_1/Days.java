package lesson_03_1;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        int dayNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current day number: ");
        dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1: {
                System.out.println("Today is monday");
                break;
            }
            case 2: {
                System.out.println("Today is tuesday");
                break;
            }
            case 3: {
                System.out.println("Today is wednesday");
                break;
            }
            case 4: {
                System.out.println("Today is tuesday");
                break;
            }
            case 5: {
                System.out.println("Today is friday");
                break;
            }
            case 6: {
                System.out.println("Today is sunday");
                break;
            }
            case 7: {
                System.out.println("Today is saturday");
                break;
            }
            default: {
                System.out.println("Wrong day number!");
            }
        }
    }
}
