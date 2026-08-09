package arrays.frequentElements;

public class CheckAllEleUnique {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

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
                System.out.println("All elements are not unique");
                return;
            }
        }

        System.out.println("All elements are unique");
    }
}
