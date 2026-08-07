package arrayAssignment.seggregrationPrograms;

import java.util.Arrays;

public class SegUppercaseLowercase {

    public static void main(String[] args) {

        char[] chars = {'a', 'A', 'b', 'c', 'B', 'd', 'B', 'D'};

        System.out.println(Arrays.toString(chars));

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && chars[i] >= 'a' && chars[i] <= 'z') {
                i++;
            }

            while (i < j && chars[j] >= 'A' && chars[j] <= 'Z') {
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