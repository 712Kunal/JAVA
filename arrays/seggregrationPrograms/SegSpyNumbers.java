package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegSpyNumbers {
    private static boolean isSpyNumber(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            sum += digit;
            product *= digit;

            num /= 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {
        int[] nums = {1234, 25, 1124, 567, 22, 123};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isSpyNumber(nums[i])) {
                i++;
            }

            while (i < j && !isSpyNumber(nums[j])) {
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
