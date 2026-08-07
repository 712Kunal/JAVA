package arrayAssignment;

import java.util.Arrays;

public class PerfectNumberArr {
	public static void main(String[] args) {
		 int[] arr = {5, 6, 10, 28, 30, 496, 500, 8128};
		 System.out.println(Arrays.toString(storePerfecttNumber(arr)));
	}
	public static int[] storePerfecttNumber(int[] arr) {
	  	  int count=0;
	  	  for(int a :arr) {
	  		  if(isPerfect(a)) {
	  			  count++;
	  		  }
	  	  }
	  	  int index =0;
	  	  int[] nums = new int[count];
	  	  for(int i = 0;i<arr.length;i++) {
	  		  if(isPerfect(arr[i])) {
	  			  nums[index]=arr[i];
	  			  index++;
	  		  }
	  	  }
	  	  return nums;
	    }
	public static boolean isPerfect(int num) {

        if (num <= 1)
            return false;

        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
} 
