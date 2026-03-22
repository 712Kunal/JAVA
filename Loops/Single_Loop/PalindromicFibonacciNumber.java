package Single_Loop;

import java.util.Scanner;

class PalindromicFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println();

        int n1 = 0;
        int n2 = 1;
        int ans;

        while (n1 <= num) {
            if (n1 == num) {
                int copy = 1;

                for (int i = n1; i > 0; i /= 10) {
                    copy *= 10;
                    copy += i % 10;
                }

                if (copy == num) {
                    System.out.println(num + " is a palindromic Fibonacci number");
                    break;
                }
            }

            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }

        if (n1 > num) {
            System.out.println(num + " is not a palindromic Fibonacci number");
        }
    }
}
