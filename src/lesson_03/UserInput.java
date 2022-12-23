package lesson_03;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        String name;
        int age;
        double grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = input.nextLine();

        System.out.println("Enter your age:");
        age = input.nextInt();

        System.out.println("Enter your grade:");
        grade = input.nextDouble();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
    }
}