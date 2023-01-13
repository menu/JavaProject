package lesson_07.homework;

import java.util.Scanner;

public class Cat {
    private String name, color;
    private int age;

    Scanner input = new Scanner(System.in);

    public Cat(String name, String color, int age) {
        while (age <= 0 || age > 25){
            System.out.print("Looks like you entered wrong age, try again: ");
            age = input.nextInt();
        }
        this.name = name;
        this.color = color;
        this.age = age;
        input.close();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}
