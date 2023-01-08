package lesson_05.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Countries {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        String getCity, getCountry;
        int counter;
        Scanner input = new Scanner(System.in);

        System.out.print("How many city you want to add: ");
        counter = input.nextInt();

        while (counter != 0) {
            System.out.print("Enter city (" + counter + " city left): ");
            getCity = input.next();
            while (countries.containsKey(getCity)) {
                System.out.print("You already entered this city, try another: ");
                getCity = input.next();
            }
            System.out.print("Enter country (" + counter + " country left): ");
            getCountry = input.next();
            countries.put(getCity, getCountry);
            counter -= 1;
        }


        System.out.println("---------------------------");
        System.out.println("List of countries:");
        List<String> uniqueCountry = countries.values().stream().distinct().collect(Collectors.toList());
        for (String s : uniqueCountry) {
            System.out.println(s);
        }

        System.out.println("---------------------------");
        System.out.println("List of «City - Country» pairs");
        countries.forEach((city, country) -> System.out.println(city + " - " + country ));

        input.close();
    }
}
