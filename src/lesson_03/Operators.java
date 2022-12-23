package lesson_03;

public class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        double c = 20;
        double d = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double result = (c / d);
        System.out.println("c / d = " + result);
        System.out.println("result + result + result = " + (6.666666666666667 + 6.666666666666667 + 6.666666666666667));
        System.out.println("c % d = " + (c % d));

        int resultOfInt = a / b;
//        int resultOfIntDouble = a * c;  <- not valid operation
        double resultOfIntDouble = c / b;
        System.out.println("resultOfIntDouble = " + resultOfIntDouble);

//        System.out.println("a / 0 = " + (a / 0));  // ArithmeticException: / by zero
        System.out.println("c / 0 = " + (c / 0)); // Double divided by zero -> Infinity


    }
}