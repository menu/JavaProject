package lesson_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        firstNumber = input.nextDouble();
        System.out.println("Введите второе число: ");
        secondNumber = input.nextDouble();

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " : " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));



    }
}