package arrayAssignment;

import java.util.Arrays;

public class PalindromeArr {
     public static void main(String[] args) {
		int[] arr = {121,12321,123321,1222321};
		System.out.println(Arrays.toString(storePalindrome(arr)));
	}
     public static int[] storePalindrome(int[] arr) {
    	 int count = 0;
    	 for(int a : arr) {
    		 if(isPalindrome(a)) {
    			 count++;
    		 }
    		 
    	 }
    	 int index =0;
    	 int[] nums = new int[count];
    	 for(int i = 0;i<arr.length;i++) {
    		 if(isPalindrome(arr[i])) {
    			 nums[index]=arr[i];
    			 index++;
    		 }
    	 }
    	 return nums;
     }
     public static boolean isPalindrome(int num) {
    	 int rev = 0;
    	 int temp = num;
    	 while(temp>0) {
    		 int ld = temp%10;
    		 rev = rev*10+ld;
    		 temp/=10;
    	 }
    	 
    	 return num == rev;
    	 //return num == reverse(num);
     }
     
//     public static int reverse(int num) {
//    	 int rev = 0;
//    	 while(num>0) {
//    		 int ld = num%10;
//    		 rev = rev*10+ld;
//    		 num/=10;
//    	 }
//    	 return rev;
//     }
}
