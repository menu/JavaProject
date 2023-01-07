package lesson_05.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Enter collections size: ");
        size = input.nextInt();

        for (int i = 0; i < size; i++) {
            numbers.add(i + 1);
            System.out.print("Enter " + (i + 1) + " name: ");
            names.add(input.next());
        }

        for (int i = 0; i < size; i++) {
            list.add(numbers.get(i) + " - " + names.get(i));
        }

        System.out.println("numbers = " + numbers);
        System.out.println("names = " + names);
        System.out.println("list = " + list);

        input.close();
    }
}
