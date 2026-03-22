package Single_Loop;

import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int fact = 1;

        int i = num;
        while (i > 0) {
            fact *= i;
            i--;
        }

        System.out.println("The factorial of " + num + " is: " + fact);
    }
}
