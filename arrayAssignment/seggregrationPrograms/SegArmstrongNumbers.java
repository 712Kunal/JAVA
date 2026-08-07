package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegArmstrongNumbers {
    private static boolean isArmstrongNumber(int num) {
        int cnt = 0;
        int copy = num;

        while (copy > 0) {
            cnt++;
            copy /= 10;
        }

        copy = num;

        int sum = 0;
        while (copy > 0) {
            sum += Math.pow(cnt, (copy % 10));
            copy /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int[] nums = {153, 12, 370, 45, 9474, 21};
        System.out.println(Arrays.toString(nums));

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && isArmstrongNumber(nums[i])) {
                i++;
            }

            while (i < j && !isArmstrongNumber(nums[j])) {
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
