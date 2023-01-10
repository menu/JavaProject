package lesson_06.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AreArraysEqual {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int[] firstArray = new int[scanner.nextInt()];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array: ");
            firstArray[i] = scanner.nextInt();
        }

        System.out.print("Enter second array size: ");
        int[] secondArray = new int[scanner.nextInt()];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array: ");
            secondArray[i] = scanner.nextInt();
        }
        System.out.println("Comparing...");
        TimeUnit.SECONDS.sleep(1);

        System.out.print("First method: ");
        arraysEqualsFirstMethod(firstArray, secondArray);
        System.out.print("Second method: ");
        System.out.println("Is arrays equal: " + arraysEqualsSecondMethod(firstArray, secondArray));

        scanner.close();

    }

    public static void arraysEqualsFirstMethod(int[] firstArray, int[] secondArray) {
        boolean equals = true;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    equals = false;
                    break;
                }
            }
        } else equals = false;

        System.out.println("Is array equals: " + equals);
    }

    public static boolean arraysEqualsSecondMethod(int[] firstArray, int[] secondArray) {
        return Arrays.equals(firstArray, secondArray);
    }
}
