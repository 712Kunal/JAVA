package Single_Loop;

import java.util.Scanner;

class SumOfEvenAndOddDigitsAndFetchingFromFirst {

    public static void main(String[] args) {
        int eSum = 0;
        int oSum = 0;

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i > 0; i = i / 10) {
            int ld = i % 10;
            if (ld % 2 == 0) {
                eSum += ld;
            } else {
                oSum += ld;
            }
        }

        System.out.println("sum of even digits: " + eSum);
        System.out.println("sum of odd digits: " + oSum);

        System.out.println();
        System.out.println();

        System.out.println("Fetcing the first digits from the number: ");
        int len = 0;
        for (int i = num; i > 0; i /= 10) {
            len++;
        }

        int divi = 1;
        for (int i = 1; i <= len; i++) {
            divi *= 10;
        }

        for (int i = num; i != 0; i = i % divi) {
            divi = divi / 10;
            int fd = i / divi;

            System.out.print(fd + "_");
        }
    }
}
