
package lesson02;

public class Task01 {
    public static void main(String[] args) {
        int[] a = {1, 10, 20, -10, 18};
        System.out.println("Минимальное число в одномерном массиве: " + minValue(a));
        System.out.println("Максимальное число в одномерном массиве: " + maxValue(a));
        System.out.println("Сумма элементов массива: " + sum(a));
    }

    public static int minValue(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int maxValue(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

