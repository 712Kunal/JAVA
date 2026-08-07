package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegAlphabetsDigits {
    public static void main(String[] args) {
        char[] chars = {'a', '1', 'b', '2', 'e', 'd', '5'};

        System.out.println(Arrays.toString(chars));

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && chars[i] >= 48 && chars[i] <= 57) {
                i++;
            }

            while (i < j && chars[j] >= 'a' && chars[j] <= 'z') {
                j--;
            }

            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(chars));
    }
}
