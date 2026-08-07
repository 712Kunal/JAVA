package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegDuckNumbers {
    private static boolean isDuckNumber(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {100, 2, 3, 40, 50000, 6, 7, 80};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isDuckNumber(nums[i])) {
                i++;
            }

            while (i < j && !isDuckNumber(nums[j])) {
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
