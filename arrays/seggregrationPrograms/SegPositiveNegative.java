package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegPositiveNegative {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -2, 5, -8, 9};

        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] < 0) {
                i++;
            }

            while (i < j && nums[j] >= 0) {
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
