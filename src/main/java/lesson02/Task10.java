package lesson02;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] mass1 = {-1, 2, 5};
        int[] mass2 = {0, 2, 6, 8, 10, 15};
        System.out.println(Arrays.toString(mergeArrays(mass1, mass2)));

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i<a1.length && j<a2.length) {
            if (a1[i] <= a2[j]) {
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }
            System.out.println(i);
            System.out.println(j);
            k++;
        }
        while (i<a1.length){
            result[k] = a1[i];
            i++;
            k++;
        }
        while (j<a2.length){
            result[k] = a2[j];
            j++;
            k++;
        }
        return result;
    }
}
