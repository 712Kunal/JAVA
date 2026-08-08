package arrays;

import java.util.Arrays;

public class PerfectSquareArr {
     public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7, 9, 10, 16, 20, 25, 30, 36};
		System.out.println(Arrays.toString(storePerfectSquare(arr)));
	}
     public static int[] storePerfectSquare(int[] arr) {
    	 int count =0;
    	 for(int a : arr) {
    		 if(isPerfectSquare(a)) {
    			 count++;
    		 }
    	 }
    	 int index = 0;
    	 int[] nums = new int[count];
    	 
    	 for(int i= 0;i<arr.length;i++) {
    		 if(isPerfectSquare(arr[i])) {
    			 nums[index] = arr[i];
    			 index++;
    		 }
    	 }
    	 return nums;
     }
     
     public static boolean isPerfectSquare(int num) {

         if (num < 0) {
             return false;
         }

         for (int i = 0; i * i <= num; i++) {
             if (i * i == num) {
                 return true;
             }
         }

         return false;
     }
}
