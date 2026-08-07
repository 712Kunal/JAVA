package arrayAssignment;

import java.util.Arrays;

public class HarshadNumberArr {
      public static void main(String[] args) {
		int[] arr=  {18, 19, 21, 24, 25, 27, 30, 35, 40};
		System.out.println(Arrays.toString(storeHarshadNumber(arr)));
;	}
      public static int[] storeHarshadNumber(int[] arr) {
    	  int count =0 ;
    	  for(int a : arr) {
    		  if(isHarshad(a)) {
    			  count++;
    		  }
    	  }
    	  int index = 0;
    	  int [] nums = new int[count];
    	  for(int i =0 ;i<arr.length ;i++) {
    		  if(isHarshad(arr[i])) {
    			  nums[index ]= arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      public static boolean isHarshad(int num) {
    	  int sum =0;
    	  int temp= num;
    	  while(temp>0) {
    		  sum += (temp%10);
    		  temp/=10;
    	  }
    	  
    	  return num% sum ==0;
      }
}
