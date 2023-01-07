package lesson_05.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int size;
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<Integer,Integer> uniqueNumbers = new HashMap<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = input.nextInt();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(50));
        }

        for (int number : numbers){
            uniqueNumbers.put(number,number);
        }

        System.out.println("ArrayList contains " + numbers.size() + " numbers: " + uniqueNumbers.size() + " is unique, " + (numbers.size() - uniqueNumbers.size()) + " is repeating");

        input.close();
    }
}
