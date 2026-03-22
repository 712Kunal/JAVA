package Single_Loop;

import java.util.Scanner;

class NeonNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int numSquare = (int) Math.pow(num, 2);

        int sum = 0;

        while (numSquare > 0) {
            sum += numSquare % 10;
            numSquare /= 10;
        }

        if (sum == numSquare) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }
    }
}
