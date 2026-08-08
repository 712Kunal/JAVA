package arrays.frequentElements;

public class TotalNumberOfDistinctEle {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 8, 8, 9, 9, 10, 11};

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

        int cnt = 0;

        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] > 0) {
                cnt++;
            }
        }

        System.out.println("Total number of distinct elements: " + cnt);
    }
}
