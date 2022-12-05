package lesson02;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(8, 16));
        System.out.println(greatestCommonDivisor(1, 10));
        System.out.println(greatestCommonDivisor(54, 24));
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = 0;
        int[] result1 = divisors(a);
        int[] result2 = divisors(b);
        for (int i = 0; i < result1.length; i++) {
            for (int q = 0; q < result2.length; q++) {
                if (result1[i] == result2[q] && result1[i] > max) {
                    max = result1[i];
                    break;
                }
            }
        }
        return max;
    }

    public static int[] divisors(int a) {
        int[] result = new int[a];
        int j = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
