package lesson_03_1.homework;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        int monthNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month number: ");
        monthNumber = input.nextInt();
        switch (monthNumber) {
            case 1: {
                System.out.println("Current month is January");
                break;
            }
            case 2: {
                System.out.println("Current month is February");
                break;
            }
            case 3: {
                System.out.println("Current month is March");
                break;
            }
            case 4: {
                System.out.println("Current month is April");
                break;
            }
            case 5: {
                System.out.println("Current month is May");
                break;
            }
            case 6: {
                System.out.println("Current month is June");
                break;
            }
            case 7: {
                System.out.println("Current month is July");
                break;
            }
            case 8: {
                System.out.println("Current month is August");
                break;
            }
            case 9: {
                System.out.println("Current month is September");
                break;
            }
            case 10: {
                System.out.println("Current month is October");
                break;
            }
            case 11: {
                System.out.println("Current month is November");
                break;
            }
            case 12: {
                System.out.println("Current month is December");
                break;
            }
            default: {
                System.out.println("Wrong month number!");
            }
        }
        input.close();

    }
}
