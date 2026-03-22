package Single_Loop;

import java.util.Scanner;

class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int den = 1;

        int factorsSum = 0;

        while (den <= num / 2) {
            if (num % den == 0) {
                factorsSum += den;
            }

            den++;
        }

        if (factorsSum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
