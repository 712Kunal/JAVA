package arrayAssignment;

import java.util.Arrays;

public class SunnyNumberArr {
    public static void main(String[] args) {
    	int[] arr = {3, 4, 8, 10, 15, 20, 24, 35};
    	System.out.println(Arrays.toString(storeSunnyNumber(arr)));
	}
    public static int[] storeSunnyNumber(int[] arr) {
    	int count = 0;
    	for(int a: arr) {
    		if(isSunny(a)) {
    			count++;
    		}
    	}
    	int index = 0;
    	int[] nums = new int[count];
    	for(int i = 0;i<arr.length;i++) {
    		if(isSunny(arr[i])) {
    			nums[index]=arr[i];
    			index++;
    		}
    	}
    	return nums;
    }
    
    public static boolean isSunny(int num) {

        int next = num + 1;

        for (int i = 0; i * i <= next; i++) {
            if (i * i == next) {
                return true;
            }
        }

        return false;
    }
}
