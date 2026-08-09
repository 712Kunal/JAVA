package arrays.frequentElements;

public class FreqOfEvenEle {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5};

        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxi) {
                maxi = num;
            }
        }

        int[] freqs = new int[maxi + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                freqs[nums[i]]++;
            }
        }

        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] != 0) {
                System.out.println(i + " " + freqs[i]);
            }
        }
    }
}
