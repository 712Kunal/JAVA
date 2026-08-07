package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegPalindromNumbers {
    private static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int[] nums = {121, 45, 1331, 78, 999, 20};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isPalindrome(nums[i])) {
                i++;
            }

            while (i < j && !isPalindrome(nums[j])) {
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
