package arrays.MissingElements;

public class SmallestMissingOddno {

	    public static void main(String[] args) {

	        int[] a = {1, 5, 7, 9};

	        smallestMissingOdd(a);
	    }

	    public static void smallestMissingOdd(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i] && i % 2 != 0) {

	                System.out.println("Smallest missing odd = " + i);

	                return;
	            }
	        }
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
