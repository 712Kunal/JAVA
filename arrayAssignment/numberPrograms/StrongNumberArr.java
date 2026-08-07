package arrayAssignment;

import java.util.Arrays;

public class StrongNumberArr {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 145, 150, 40585, 100, 10};
		 System.out.println(Arrays.toString(storeStrongNumber(arr)));
	}
	public static int[] storeStrongNumber(int[] arr) {
  	  int count=0;
  	  for(int a :arr) {
  		  if(isStrong(a)) {
  			  count++;
  		  }
  	  }
  	  int index =0;
  	  int[] nums = new int[count];
  	  for(int i = 0;i<arr.length;i++) {
  		  if(isStrong(arr[i])) {
  			  nums[index]=arr[i];
  			  index++;
  		  }
  	  }
  	  return nums;
    }
	public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        return sum == num;
    }
}
