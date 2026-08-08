package arrays.MissingElements;

public class SumOfMissingNumber {

	    public static void main(String[] args) {

	        int[] a = {5, 6, 7, 9, 11};

	        sumOfMissing(a);
	    }

	    public static void sumOfMissing(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        int sum = 0;

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i]) {

	                sum = sum + i;
	            }
	        }

	        System.out.println("Sum = " + sum);
	    }

	    public static int max(int[] nums) {

	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < nums.length; i++) {

	            if (nums[i] > max) {

	                max = nums[i];
	            }
	        }

	        return max;
	    }
	
}
