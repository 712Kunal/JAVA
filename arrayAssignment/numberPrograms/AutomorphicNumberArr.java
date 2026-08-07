package arrayAssignment;

import java.util.Arrays;

public class AutomorphicNumberArr {
       public static void main(String[] args) {
    	   int[] arr = {5, 6, 10, 25, 76, 12, 13};
    	   System.out.println(Arrays.toString(storeAutomorphicNumber(arr)));
		
	}
       public static int[] storeAutomorphicNumber(int[] arr) {
    	   int count = 0;
    	   for(int a : arr) {
    		   if(isAutomorphic(a)) {
    			   count++;
    		   }
    	   }
    	   int index = 0;
    	   int[] nums = new int[count];
    	   for(int i = 0;i<arr.length;i++) {
    		   if(isAutomorphic(arr[i])) {
    			   nums[index] =arr[i];
    			   index++;    		   
    			}
    	   }
    	   return nums;
    	   
       }
       public static boolean isAutomorphic(int num) {
    	   int div = 1;
    	   int temp= num;
    	   while(temp > 0) {
    		   div*=10;
    		   temp/=10;
    	   }
    	   
    	   int square = num*num;
    	   return square%div == num;
       }
}
