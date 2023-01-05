package lesson_05;

import java.util.concurrent.ThreadLocalRandom;

public class CustomerArray {
    public static void main(String[] args) {
        double array[] = ThreadLocalRandom.current().doubles(10, 0, 100).toArray();
        double minValue = 101, maxValue = 0, sumValue = 0;

        for (double i : array) {
            if (i < minValue) {
                minValue = i;
            }
            if (i > maxValue) {
                maxValue = i;
            }
            sumValue += i;
        }
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);
        System.out.println("sumValue = " + sumValue);
        System.out.println("averageValue = " + (sumValue / 10));
    }
}
