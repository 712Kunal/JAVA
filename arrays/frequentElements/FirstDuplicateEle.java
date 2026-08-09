package arrays.frequentElements;

public class FirstDuplicateEle {
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
        }

        int firstDuplicate = 0;
        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] > 1) {
                System.out.println("The first duplicate element is " + i);
                break;
            }
        }
    }
}
