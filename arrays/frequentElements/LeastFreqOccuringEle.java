package arrays.frequentElements;

public class LeastFreqOccuringEle {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5};

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

        int leastFrequency = Integer.MAX_VALUE;
        int lessFrequentEle = 0;
        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] != 0 && leastFrequency > freqs[i]) {
                leastFrequency = freqs[i];
                lessFrequentEle = i;
            }
        }

        System.out.println("Least frequent element is " + lessFrequentEle);
    }
}
