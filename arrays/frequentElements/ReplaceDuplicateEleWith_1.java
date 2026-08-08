package arrays.frequentElements;

public class ReplaceDuplicateEleWith_1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 8, 9};

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

        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] > 1) {
                freqs[i] = -1;
            }
        }

        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] != 0) {
                if (freqs[i] == 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(freqs[i] + " ");
                }
            }
        }
    }
}
