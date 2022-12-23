package lesson_03.homework;

public class homework_task_1 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        //result = -16.7

        int a = 5;
        int b = 8;
        int a_result;
        int b_result;
        a_result = a-- - --a + ++a + a++ + a;
        // a_result = 15
        b_result = ++b - b++ + ++b - --b;
        // b_result = 1
    }
}
