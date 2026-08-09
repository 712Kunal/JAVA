package arrays.frequentElements;

public class CheckEleRepeated {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 4, 5};

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

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else if (freqs[nums[i]] > 1) {
                System.out.println(nums[i] + " is repeated");
            } else {
                System.out.println(nums[i] + " is NOT repeated");
            }
        }
    }
}
