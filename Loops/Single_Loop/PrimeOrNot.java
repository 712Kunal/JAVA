package Single_Loop;

import java.util.Scanner;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num > 1) {
            int den = 2;
            while (den <= num / 2) {
                if (num % den == 0) {
                    break;
                }
                den++;
            }

            if (den > num / 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}