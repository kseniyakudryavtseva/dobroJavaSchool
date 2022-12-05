package lesson02;

public class Task08 {
    public static void main(String[] args) {
        String str1 = "QweString231";
        String str2 = "we2tg3QiSnr";
        System.out.println(extraSymbol(str1, str2));
    }

    public static char extraSymbol(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        if (s1.length > s2.length) {
            for (int i = 0; i < s1.length; i++) {
                boolean founded = false;
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i] == s2[j]) {
                        founded = true;
                        break;
                    }
                }
                if (!founded) {
                    return s1[i];
                }
            }
        } else {
            for (int i = 0; i < s2.length; i++) {
                boolean founded = false;
                for (int j = 0; j < s1.length; j++) {
                    if (s2[i] == s1[j]) {
                        founded = true;
                        break;
                    }
                }
                if (!founded) {
                    return s2[i];
                }
            }
        }
        return '!';
    }
}
