package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegPerfectNumber {
    private static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int factorSum = 0;
        int i = 1;

        while (i <= num / 2) {
            if (num % i == 0) {
                factorSum += i;
            }
            i++;
        }

        return factorSum == num;
    }

    public static void main(String[] args) {
        int[] nums = {12, 6, 28, 15, 496, 20};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isPerfectNumber(nums[i])) {
                i++;
            }

            while (i < j && !isPerfectNumber(nums[j])) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
