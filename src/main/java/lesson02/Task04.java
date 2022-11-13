package lesson02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println(calcFIb(8));
    }
    public static int calcFIb(int n){
        if (n == 1)
        {
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return calcFIb(n-1) + calcFIb(n-2);
    }
}



