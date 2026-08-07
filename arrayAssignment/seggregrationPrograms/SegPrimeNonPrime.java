package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegPrimeNonPrime {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int den = 2;
        while (den < num) {
            if (num % den == 0) {
                return false;
            }

            den++;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && !isPrime(nums[i])) {
                i++;
            }

            while (i < j && isPrime(nums[j])) {
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
