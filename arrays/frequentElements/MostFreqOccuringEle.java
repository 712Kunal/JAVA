package arrays.frequentElements;

public class MostFreqOccuringEle {
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

        int mostFrequency = Integer.MIN_VALUE;
        int mostFrequentEle = 0;
        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] != 0 && freqs[i] > mostFrequency) {
                mostFrequency = freqs[i];
                mostFrequentEle = i;
            }
        }

        System.out.println("Most frequent element is " + mostFrequentEle);
    }
}
