package arrayAssignment.MissingElements;

public class MissingNoFrom0toN {

	    public static void main(String[] args) {

	        int[] a = {3, 0,5,8, 1};

	        printMissingNo(a);
	    }

	    public static void printMissingNo(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = 0; i <= max; i++) {

	            if (!isPresent[i]) {

	                System.out.println("Missing number = " + i);
	             
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
