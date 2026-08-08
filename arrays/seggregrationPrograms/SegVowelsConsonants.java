package arrays.seggregrationPrograms;

import java.util.Arrays;

public class SegVowelsConsonants {

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'e', 'i', 'c', 'd', 'o', 'f', 'u'};

        System.out.println(Arrays.toString(chars));

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && isVowel(chars[i])) {
                i++;
            }

            while (i < j && !isVowel(chars[j])) {
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

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}