package lesson_03_1.homework;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserSystem {
    public static void main(String[] args) throws Exception {
        String username = "admin";
        String pass = "password";
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        input = scanner.next();

        if (input.equals(username)) {
            System.out.print("Enter your system password: ");
            input = scanner.next();
            if (input.equals(pass)) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Welcome " + username + ", you entered the system!");
            } else {
                System.out.println("Checking...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("System error! Wrong password!");
            }
        } else {
            System.out.println("Checking...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("System error! Wrong username!");
        }
        scanner.close();
    }
}
