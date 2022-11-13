package lesson01;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c-a-b)<= 0.0001;
    }
}

