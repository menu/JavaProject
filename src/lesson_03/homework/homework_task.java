package lesson_03.homework;

public class homework_task {
    public static void main(String[] args) {
        // First task
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;//result = -16.7

        int a = 5;
        int b = 8;
        int a_result = a-- - --a + ++a + a++ + a;// a_result = 15
        int b_result = ++b - b++ + ++b - --b;// b_result = 1

        //Second task
        int x = 10, y = 12, z = 3;
        x += y - (x++ * z);
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
