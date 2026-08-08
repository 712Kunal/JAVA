package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegMultiples3Others {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 12, 6, 2, 9};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && nums[i] % 3 == 0) {
                i++;
            }

            while (i < j && nums[j] % 3 != 0) {
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
