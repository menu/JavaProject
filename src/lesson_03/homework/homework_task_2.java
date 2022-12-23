package lesson_03.homework;

public class homework_task_2 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
        x += y - x++ * z;
        System.out.println("x = " + x);
        z = --x - y * 5;
        System.out.println("z = " + z);
        y /= x + 5 % z;
        System.out.println("y = " + y);
        z = x++ + y * 5;
        System.out.println("z = " + z);
        x = y - x++ * z;
        System.out.println("x = " + x);
    }
}
