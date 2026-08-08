package arrays.MissingElements;

public class MissingNumberBetMinAndMax {


	    public static void main(String[] args) {

	        int[] a = {5, 6, 9, 11};

	        printMissingBetweenMinMax(a);
	    }

	    public static void printMissingBetweenMinMax(int[] nums) {

	        int min = min(nums);
	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = min; i <= max; i++) {

	            if (!isPresent[i]) {

	                System.out.println(i);
	            }
	        }
	    }

	    public static int min(int[] nums) {

	        int min = Integer.MAX_VALUE;

	        for (int i = 0; i < nums.length; i++) {

	            if (nums[i] < min) {

	                min = nums[i];
	            }
	        }

	        return min;
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
