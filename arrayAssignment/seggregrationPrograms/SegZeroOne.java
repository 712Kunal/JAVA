package arrayAssignment.seggregrationPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SegZeroOne {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 0, 1, 0};

        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && nums[i] == 0) {
                i++;
            }

            while (i < j && nums[j] == 1) {
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
