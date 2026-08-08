package arrays.frequentElements;

import java.util.Arrays;

public class ReplaceDuplicateEleWith0 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 8, 9};
        System.out.println(Arrays.toString(nums));

        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxi) {
                maxi = num;
            }
        }

        int[] freqs = new int[maxi + 1];
        for (int i = 0; i < nums.length; i++) {
            freqs[nums[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (freqs[nums[i]] > 1) {
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
