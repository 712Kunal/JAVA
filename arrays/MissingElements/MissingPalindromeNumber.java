package arrays.MissingElements;

public class MissingPalindromeNumber {


	    public static void main(String[] args) {

	        int[] a = {1, 2, 3, 5, 7, 11};

	        printMissingPalindrome(a);
	    }

	    public static void printMissingPalindrome(int[] nums) {

	        int max = max(nums);

	        boolean[] isPresent = new boolean[max + 1];

	        for (int i = 0; i < nums.length; i++) {

	            isPresent[nums[i]] = true;
	        }

	        for (int i = 1; i < isPresent.length; i++) {

	            if (!isPresent[i] && isPalindrome(i)) {

	                System.out.println(i);
	            }
	        }
	    }

	    public static boolean isPalindrome(int n) {

	        int original = n;
	        int reverse = 0;

	        while (n > 0) {

	            int digit = n % 10;

	            reverse = reverse * 10 + digit;

	            n = n / 10;
	        }

	        return original == reverse;
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
