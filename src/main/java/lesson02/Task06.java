package lesson02;

public class Task06 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false, false, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int i = 0;
        if (a == true) {
            i = i + 1;
        }
        if (b) {
            i++;
        }
        if (c) {
            ++i;
        }
        if (d) {
            i++;
        }
        if (i == 2) {
            return true;
        }
        return false;
        /*
        //return i == 2;
         */
    }
}
