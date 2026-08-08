package arrayAssignment.MissingElements;

public class LastMissingNo {
	

	    public static void main(String[] args) {

	        int[] a = {5, 6, 7, 9, 11};

	        lastMissing(a);
	    }

	    public static void lastMissing(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = isPresent.length - 1; i >= 1; i--) {

	            if (!isPresent[i]) {

	                System.out.println("Last missing = " + i);

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
