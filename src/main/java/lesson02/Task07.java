package lesson02;

public class Task07 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 7, 5, 10};
        int t = 8;
        int[] mass = twoSumm(arr, t);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    private static int[] twoSumm(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
