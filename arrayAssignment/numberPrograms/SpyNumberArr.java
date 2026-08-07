package arrayAssignment;

import java.util.Arrays;

public class SpyNumberArr {
     public static void main(String[] args) {
		int [] arr={22, 123, 1124, 132, 1412, 4, 1236};
		System.out.println(Arrays.toString(StoreSpyNumber(arr)));
	}
     
     public static int[] StoreSpyNumber(int[] arr) {
    	 int count = 0;
         for(int num : arr ) {
        	 if(isSpy(num)) {
        		 count++;
        	 }
         }
         
         int[] nums = new int[count];
         int index = 0;
         for(int i =0 ;i<arr.length;i++) {
        	 if(isSpy(arr[i])) {
        		 nums[index]=arr[i];
        		 index++;
        	 }
         }
         return nums;
     }
    
     public static boolean isSpy(int num) {
    	 int sum =0;
    	 int product = 1;
    	 while(num>0) {
    		 int ld = num%10;
    		 sum+=ld;
    		 product *= ld;
    		 num/=10;
    	 }
    	 
    	 return sum == product;
     }
}
