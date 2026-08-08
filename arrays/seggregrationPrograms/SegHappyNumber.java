package arrays.seggregrationPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SegHappyNumber {
    private static int sumOfSquares(int num) {

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }

    private static boolean isHappyNumber(int num) {

        HashSet<Integer> set = new HashSet<>();

        while (num != 1 && !set.contains(num)) {

            set.add(num);

            num = sumOfSquares(num);
        }

        return num == 1;
    }

    public static void main(String[] args) {
        int[] nums = {19, 20, 7, 4, 13, 2};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isHappyNumber(nums[i])) {
                i++;
            }

            while (i < j && !isHappyNumber(nums[j])) {
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
