package lesson_03;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        System.out.println("a = " + a);
        a = a + 6;
        System.out.println("a = " + a);

        a += 10;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        a += 1;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a--;
        System.out.println("a = " + a);

        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        System.out.println("a = " + ++a);
    }
}