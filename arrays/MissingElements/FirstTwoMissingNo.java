package arrays.MissingElements;

public class FirstTwoMissingNo {


	    public static void main(String[] args) {

	        int[] a = {5, 6, 7, 9, 11};

	        firstTwoMissing(a);
	    }

	    public static void firstTwoMissing(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        int count = 0;

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i]) {

	                System.out.println(i);

	                count++;

	                if (count == 2) {

	                    return;
	                }
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
