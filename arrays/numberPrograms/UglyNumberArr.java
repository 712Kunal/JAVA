package arrays;

import java.util.Arrays;

public class UglyNumberArr {
      public static void main(String[] args) {
    	  int[] arr = {1, 2, 3, 5, 6, 8, 10, 14, 15, 25, 30};
    	  System.out.println(Arrays.toString(storeUglyNumber(arr)));
		
	}
      public static int[] storeUglyNumber(int[] arr) {
    	  int count=0;
    	  for(int a :arr) {
    		  if(isUgly(a)) {
    			  count++;
    		  }
    	  }
    	  int index =0;
    	  int[] nums = new int[count];
    	  for(int i = 0;i<arr.length;i++) {
    		  if(isUgly(arr[i])) {

    			  nums[index]=arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      public static boolean isUgly(int num) {
    	  if(num<=0) {
    		  return false;			  
    	  }
    	  while(num>0) {
    	   if(num%2==0) {
    		  num/=2;
    	   }
    	   else if(num%3==0) {
    		  num/=3;
    	   }
    	   else if(num%5==0) {
    		  num/=5;
    	   }else {
    		   break;
    	   }
    	  }
    	  
    	  return num==1;
      }
}
