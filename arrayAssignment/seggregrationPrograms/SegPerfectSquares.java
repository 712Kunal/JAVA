package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegPerfectSquares {
    private static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);

        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 9, 15, 16, 7, 25};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isPerfectSquare(nums[i])) {
                i++;
            }

            while (i < j && !isPerfectSquare(nums[j])) {
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
