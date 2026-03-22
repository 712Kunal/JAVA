package Single_Loop;

import java.util.Scanner;

class SpyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        int prod = 1;

        int i = num;
        while (i > 0) {
            sum += i % 10;
            prod *= i % 10;
            i /= 10;
        }

        if (sum == prod) {
            System.out.println(num + " is a spy number");
        } else {
            System.out.println(num + " is not a spy number");
        }
    }
}
