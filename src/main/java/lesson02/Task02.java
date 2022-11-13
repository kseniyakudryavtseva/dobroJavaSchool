package lesson02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int[][][] arr = new int[][][]{{{1, 2}, {5, 10}}, {{-1, 80}, {3, 4}, {7, -5}}};

        System.out.println("Максимальное число в многомерном массиве: " + maxValue(arr));

    }
    public static int maxValue (int [][][] a)
    {
        int max = a[0][0][0];
        for (int i=1; i<a.length; i++)
        {
            for (int j=1; j<a.length;j++)
            {
                for (int k=1; k<a.length;k++)
                {
                    if (a[i][j][k]>max)
                    {
                        max = a[i][j][k];
                    }
                }
            }
        }
        return max;
    }
}
