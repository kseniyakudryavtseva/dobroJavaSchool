package lesson02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        miniGame();
    }

    public static void miniGame() {
        int r = (int) (Math.random() * 100);
        System.out.println("Введите число:");
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            System.out.println("input=" + input);
            int i = Integer.parseInt(input);
            if (r > i) {
                System.out.println("Введите число побольше!");
            } else if (r < i) {
                System.out.println("Введите число поменьше!");
            } else {
                System.out.println("Угадали!");
                break;
            }
        }
    }
}