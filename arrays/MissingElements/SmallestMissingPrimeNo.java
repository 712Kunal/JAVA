package arrays.MissingElements;

public class SmallestMissingPrimeNo {


	    public static void main(String[] args) {

	        int[] a = {2, 3, 7, 11};

	        smallestMissingPrime(a);
	    }

	    public static void smallestMissingPrime(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i] && isPrime(i)) {

	                System.out.println("Smallest missing prime = " + i);

	                return;
	            }
	        }
	    }

	    public static boolean isPrime(int n) {

	        if (n < 2) {

	            return false;
	        }

	        for (int i = 2; i < n; i++) {

	            if (n % i == 0) {

	                return false;
	            }
	        }

	        return true;
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
