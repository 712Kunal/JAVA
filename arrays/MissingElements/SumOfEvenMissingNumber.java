package arrays.MissingElements;

public class SumOfEvenMissingNumber {
	
	    public static void main(String[] args) {

	        int[] a = {2, 4, 6, 9, 11};

	        evenMissing(a);
	    }

	    public static void evenMissing(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        int count = 0;
	        int sum = 0;

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i] && i % 2 == 0) {

	                count++;
	                sum = sum + i;
	            }
	        }

	        System.out.println("Count = " + count);
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
