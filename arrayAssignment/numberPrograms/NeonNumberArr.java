package arrayAssignment;

import java.util.Arrays;

public class NeonNumberArr {
     public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 9, 10, 11, 15, 20};
		System.out.println("Array of Neon number is : ");
		System.out.println(Arrays.toString(StoreNeonNumber(arr)));
	}

	 public static int[] StoreNeonNumber(int[] arr) {
		 int count = 0;
	
		 for(int num : arr) {
			 if(isNeon(num)) {
			 count++;
			 }
		 }
		
		int[] arr1 = new int[count];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(isNeon(arr[i])) {
				arr1[index]=arr[i];
				index++;
			}
		}
		return arr1;
	 }

	 public static boolean isNeon(int num) {
		int square = num*num;
		int sum =0;
		while(square>0) {
			int ld = square%10;
			sum+=ld;
			square/=10;
		}
		return sum==num;
	 }
}
