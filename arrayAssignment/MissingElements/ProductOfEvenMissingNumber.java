package arrayAssignment.MissingElements;

public class ProductOfEvenMissingNumber {

	

	    public static void main(String[] args) {

	        int[] a = {2, 4, 8, 9, 11};

	        evenMissingProduct(a);
	    }

	    public static void evenMissingProduct(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        int count = 0;
	        int product = 1;

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i] && i % 2 == 0) {

	                count++;
	                product = product * i;
	            }
	        }

	        System.out.println("Count = " + count);
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
