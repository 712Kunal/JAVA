package arrayAssignment;

import java.util.Arrays;

public class PrimeNumberArr {
      public static void main(String[] args) {
		int[ ] arr = {1,2,3,5,7,9,10,13,17,19,22};
		System.out.println(Arrays.toString(StorePrimeNumber(arr)));
	}
      public static int[] StorePrimeNumber(int[] arr) {
    	  int count =0 ;
    	  for(int a : arr) {
    		  if(isPrime(a)) {
    			  count++;
    		  }
    	  }
    	  int index = 0;
    	  int[] nums = new int[count];
    	  for(int i =0;i<arr.length;i++) {
    		  if(isPrime(arr[i])) {
    			  nums[index]=arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      
      public static boolean isPrime(int num) {
    	  if(num <= 1) {
    		  return false;
    	  }
    	  for(int i =2 ;i<num;i++) {
    		  if(num%i==0) {
    			  return false;
    		  }
    	  }
    	  return true;
      }
}
