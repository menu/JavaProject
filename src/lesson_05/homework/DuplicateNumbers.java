package lesson_05.homework;

import java.util.*;

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

        System.out.println("Duplicate numbers:");
        for (int number : numbers) {
            uniqueNumbers.put(number, Collections.frequency(numbers, number));
            if (Collections.frequency(numbers, number) > 1) {
                System.out.println("Number " + number + " duplicates " + Collections.frequency(numbers, number) + " times");
            }
        }

        System.out.println("ArrayList contains " + numbers.size() + " numbers: " + uniqueNumbers.size() + " is unique, " + (numbers.size() - uniqueNumbers.size()) + " is repeating");
        System.out.println("numbers = " + numbers);
        System.out.println("uniqueNumbers = " + uniqueNumbers);

        input.close();
    }
}
