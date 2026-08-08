package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegLettersSpecialCharacters {
    public static void main(String[] args) {
        char[] chars = {'a', '$', 'b', 'c', '&', 'd', '#'};

        System.out.println(Arrays.toString(chars));

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && chars[i] >= 'a' && chars[i] <= 'z') {
                i++;
            }

            while (i < j && (!((chars[j] >= 97 && chars[j] <= 122) || (chars[j] >= 48 && chars[j] <= 57)))) {
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
