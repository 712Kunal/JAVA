package Single_Loop;

import java.util.Scanner;

class TwinPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int ans = num1 - num2;

        if (ans == 2) {
            int den = 2;
            while (den <= num1 / 2) {
                if (num1 % den == 0) {
                    break;
                }
                den++;
            }

            if (den > num1 / 2) {
                den = 2;
                while (den <= num2 / 2) {
                    if (num2 % den == 0) {
                        break;
                    }
                    den++;
                }

                if (den > num2 / 2) {
                    System.out.println(num1 + " and " + num2 + " are a twin prime numbers");
                } else {
                    System.out.println(num1 + " and " + num2 + " are not a twin prime numbers");
                }
            } else {
                System.out.println(num1 + " and " + num2 + " are not a twin prime numbers");
            }
        } else {
            System.out.println(num1 + " and " + num2 + " are not a twin prime numbers");
        }
    }
}
