package lesson_03;

public class Comparsion {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 6;

        System.out.println("a == b " + (a == b));
        System.out.println("c != b " + (b != c));

        System.out.println("c == b " + (c == b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("c <= b " + (c <= b));
        System.out.println("b <= a " + (b <= a));
        System.out.println("b != a " + (b != a));

        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);

    }
}