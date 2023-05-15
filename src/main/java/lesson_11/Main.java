package lesson_11;

import java.util.*;

public class Main {
    final static Set<Character> SET_VOWELS = new HashSet<>(Set.of('a', 'e', 'u', 'o', 'i', 'A', 'E', 'U', 'O', 'I'));

    public static void main(String[] args) {
        System.out.println(countVowels("ABCDE")); // 2
        System.out.println(countVowels("Abcde")); // 2
        System.out.println(countVowels("ABcd")); // 1
        System.out.println(countVowels("AEOU")); // 4
        System.out.println(countVowels("")); // 0
        System.out.println(countVowels("ABC DEu")); // 3

        int[] nums = new int[]{10, 70, 20, 60, 40};
        System.out.println(Arrays.toString(twoSum(nums, 100)));

        System.out.println(mostFrequentLetter("Lorem ipsum")); // m
        System.out.println(mostFrequentLetter("Lorem ipsum dolor sit amet, consectetur e")); // e
        System.out.println(mostFrequentLetter("abba")); // a, но допустимо и b.


        LoanFinder loanFinder = new LoanFinder();
        List<Loan> list = List.of(
                new Loan(10, "123"),
                new Loan(50, "234"),
                new Loan(100, "345"),
                new Loan(20, "456")
        );
        System.out.println(loanFinder.nearestTwoLoans(list, 30));
        // [Loan{amount=10, loanNumber='123'}, Loan{amount=20, loanNumber='456'}]
        System.out.println(loanFinder.nearestTwoLoans(list, 130));
        // [Loan{amount=100, loanNumber='345'}, Loan{amount=20, loanNumber='456'}]
        System.out.println(loanFinder.nearestTwoLoans(list, 140));
        // [Loan{amount=100, loanNumber='345'}, Loan{amount=50, loanNumber='234'}]

    }

    public static int countVowels(String input) {
        int count = 0;
        char[] result = input.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (SET_VOWELS.contains(result[i])) {
                count++;
            }
        }
        return count;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            twoSum.put(nums[i], i);
            Integer a = twoSum.get(target - nums[i]);
            if (a != null) {
                return new int[]{i, a};
            }

        }
        throw new RuntimeException("Не найдена сумма");
    }

    public static char mostFrequentLetter(String s) {
        Map<Character, Integer> letterMap = new HashMap<>();
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (Character.isLetter(result[i])) {
                if (!letterMap.containsKey(result[i])) {
                    letterMap.put(result[i], 1);
                } else {
                    letterMap.put(result[i], letterMap.get(result[i]) + 1);
                }
            }
        }
        System.out.println(letterMap);
        int maxValue = 0;
        char mostFrequentLetter = 0;
        for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                mostFrequentLetter = entry.getKey();
            }
        }
        return mostFrequentLetter;
    }
}