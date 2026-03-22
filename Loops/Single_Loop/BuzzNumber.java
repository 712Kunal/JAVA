package Single_Loop;

import java.util.Scanner;

public class BuzzNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println(num + " is a buzz number");
        } else if (num % 10 == 7) {
            System.out.println(num + " is a buzz number");
        } else {
            System.out.println(num + " is not a buzz number");
        }
    }
}
