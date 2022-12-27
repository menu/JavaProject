package lesson_03_1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        //variable declaration
        int number;
        Scanner input = new Scanner(System.in);
        // code
        System.out.println("Enter your number:");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
        input.close();
    }
}
