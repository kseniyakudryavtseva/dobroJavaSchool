package lesson02;

public class Task03 {
    public static void main(String[] args) {
        String str = "Аргентинаманитнегра";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {
        String str1 = str.toLowerCase();
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
}


