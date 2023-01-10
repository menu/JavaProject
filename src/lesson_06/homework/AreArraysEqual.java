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
        System.out.println("Arrays are equal: " + arraysEqualsFirstMethod(firstArray, secondArray));
        System.out.print("Second method: ");
        arraysEqualsSecondMethod(firstArray,secondArray);

        scanner.close();

    }

    public static boolean arraysEqualsFirstMethod(int[] firstArray, int[] secondArray) {
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    return false;
                }
            }
        } else return false;
        return true;

    }

    public static void arraysEqualsSecondMethod(int[] firstArray, int[] secondArray) {
        System.out.println("Arrays are equal: " + Arrays.equals(firstArray, secondArray));
    }
}
