package arrays;

import java.util.Arrays;

public class DisariumNumberArr {
      public static void main(String[] args) {
    	  int[] arr={89, 135, 175, 123, 518, 75};
    	  System.out.println(Arrays.toString(storeDisariumNumber(arr)));
		
	}
      public static int[] storeDisariumNumber(int[] arr) {
    	  int count =0 ;
    	  for(int a : arr) {
    		  if(isDisarium(a)) {
    			  count++;
    		  }
    	  }
    	  int index = 0;
    	  int[] nums = new int[count];
    	  
    	  for(int i = 0;i<arr.length;i++) {
    		  if(isDisarium(arr[i])) {
    			  nums[index]=arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      public static boolean isDisarium(int num) {
    	  int temp =num;
    	  int power=0;
    	  
    	  while(temp>0) {
    		  power++;
    		  temp/=10;
    	  }
    	  temp = num;
    	  int sum =0;
    	  while(temp>0) {
    		  int ld = temp%10;
    		  sum+=Math.pow(ld, power);
    		  power--;
    		  temp/=10;
    	  }
    	  return sum == num;
    			 
      }
}
