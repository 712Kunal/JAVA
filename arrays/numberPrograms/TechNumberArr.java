package arrays;

import java.util.Arrays;

public class TechNumberArr {
      public static void main(String[] args) {
    	  int[] arr = {2025, 3025, 9801, 2024, 1000, 81};
    	  System.out.println(Arrays.toString(storeTechNumber(arr)));
		
	}
      public static int[] storeTechNumber(int[] arr) {
    	  int count=0;
    	  for(int a :arr) {
    		  if(isTech(a)) {
    			  count++;
    		  }
    	  }
    	  int index =0;
    	  int[] nums = new int[count];
    	  for(int i = 0;i<arr.length;i++) {
    		  if(isTech(arr[i])) {
    			  nums[index]=arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      
      public static boolean isTech(int num) {
    	  int count = 0;
    	  int temp = num;
    	
    	  while(temp>0) {
    		  count++;
    		  temp/=10;
    		
    	  }
    	  int div = 1;

    	 for (int i = 1; i <= count / 2; i++) {
    	        div *= 10;
         }
    	    
    	  if(count%2==0) {
    		  
    		  int last = num%div;
    		  int first= num/div;
    		  int sum = first+last;
    		  
    		  int square = sum*sum;
    		  
    		  return square == num;
    	  }
    	  return false;
      }
}
