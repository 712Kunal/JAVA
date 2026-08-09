package arrays.frequentElements;

public class IndexOfFirstDuplicateEle {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5};

        int maxi = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxi) {
                maxi = num;
            }
        }

        int[] freqs = new int[maxi + 1];

        for (int i = 0; i < nums.length; i++) {

            freqs[nums[i]]++;

            if (freqs[nums[i]] > 1) {
                System.out.println("Index of first duplicate element is: " + i);
                break;
            }
        }
    }
}