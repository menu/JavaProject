package lesson_04.homework;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        //Да, я знаю что на пустом месте усложняю жизнь и по условию задачи можно было обойтись без ввода чисел
        double sum = 0, average;
        int startNumber, endNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        startNumber = input.nextInt();
        System.out.print("Enter second number: ");
        endNumber = input.nextInt();

        input.close();

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        average = sum / (endNumber - startNumber);
        System.out.println("Average all numbers between " + startNumber +" and " + endNumber + " is: " + average);
    }
}
