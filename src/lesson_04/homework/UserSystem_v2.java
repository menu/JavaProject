package lesson_04.homework;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserSystem_v2 {
    public static void main(String[] args) throws Exception {
        String username = "admin", pass = "password", userInput;
        Scanner scanner = new Scanner(System.in);
        int triesNumber = 5;

        while (triesNumber != 0) {
            System.out.print("Enter your username (you have " + triesNumber + " tries): ");
            userInput = scanner.nextLine();
            if (userInput.equals(username)) {
                triesNumber = 5;
                System.out.print("Checking... ");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Correct!");
                while (triesNumber != 0) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("Enter yor password (you have " + triesNumber + " tries): ");
                    userInput = scanner.nextLine();
                    if (userInput.equals(pass)) {
                        System.out.print("Checking... ");
                        System.out.println("Correct!");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Welcome, " + username + ", to the system!" );
                        triesNumber = 0;
                    } else {
                        System.out.print("Checking... ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Wrong password!");
                        triesNumber -= 1;
                        if (triesNumber == 0) {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Login tries ended, terminate session!");
                        }
                    }
                }
            } else {
                System.out.print("Checking... ");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Wrong login!");
                triesNumber -= 1;
                if (triesNumber == 0) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Login tries ended, terminate session!");
                }
            }
        }
        scanner.close();
    }
}
