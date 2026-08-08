package arrays.MissingElements;

public class ProductOfMisisingNumber {
	
	    public static void main(String[] args) {

	        int[] a = {5, 6, 7, 9, 11};

	        productOfMissing(a);
	    }

	    public static void productOfMissing(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        int product = 1;

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i]) {

	                product = product * i;
	            }
	        }

	        System.out.println("Product = " + product);
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
