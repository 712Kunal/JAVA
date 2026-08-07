package arrayAssignment.numberPrograms;

import java.util.Arrays;

public class ArmstrongNumberArr {
       public static void main(String[] args) {
    	   int[] arr = {0, 1, 2, 10, 153, 154, 370, 371, 407, 500, 1634};
    	   System.out.println(Arrays.toString(storeArmstrongNumber(arr)));
    	   
	}
       public static int[] storeArmstrongNumber(int[] arr) {
    	  	  int count=0;
    	  	  for(int a :arr) {
    	  		  if(isArmstrong(a)) {
    	  			  count++;
    	  		  }
    	  	  }
    	  	  int index =0;
    	  	  int[] nums = new int[count];
    	  	  for(int i = 0;i<arr.length;i++) {
    	  		  if(isArmstrong(arr[i])) {
    	  			  nums[index]=arr[i];
    	  			  index++;
    	  		  }
    	  	  }
    	  	  return nums;
    	    }
       
       public static boolean isArmstrong(int num) {

           int temp = num;
           int count = 0;

           // Count digits
           while (temp > 0) {
               count++;
               temp /= 10;
           }

           if (num == 0)
               count = 1;

           temp = num;
           int sum = 0;

           // Calculate sum of digits^count
           while (temp > 0) {
               int digit = temp % 10;
               sum += (int) Math.pow(digit, count);
               temp /= 10;
           }

           if (num == 0)
               sum = 0;

           return sum == num;
       }
}
