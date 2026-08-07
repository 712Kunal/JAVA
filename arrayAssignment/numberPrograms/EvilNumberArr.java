package arrayAssignment;

import java.util.Arrays;

public class EvilNumberArr {
      public static void main(String[] args) {
    	  int[] arr = {3, 5, 7, 9, 10, 12, 15};
    	  System.out.println(Arrays.toString(storeEvilNumber(arr)));
		
	}
      public static int[] storeEvilNumber(int[] arr) {
    	  int count=0;
    	  for(int a : arr) {
    		  if(isEvil(a)) {
    			  count++;
    		  }
    	  }
    	  int index = 0;
    	  int[] nums = new int[count];
    	  
    	  for(int i = 0;i<arr.length;i++) {
    		  if(isEvil(arr[i])) {
    			  nums[index]=arr[i];
    			  index++;
    		  }
    	  }
    	  return nums;
      }
      
      public static boolean isEvil(int num) {

          int count = 0;
          int temp = num;

          while (temp > 0) {

              if (temp % 2 == 1) {
                  count++;
              }

              temp = temp / 2;
          }

          return count % 2 == 0;
      }
}
