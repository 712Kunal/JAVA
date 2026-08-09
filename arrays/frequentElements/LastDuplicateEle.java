package arrays.frequentElements;

public class LastDuplicateEle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 7, 8, 9, 10};

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

        int lastDuplicate = 0;
        for (int i = freqs.length - 1; i > 0; i--) {
            if (freqs[i] > 1) {
                System.out.println("The last duplicate element is " + i);
                break;
            }
        }
    }
}
