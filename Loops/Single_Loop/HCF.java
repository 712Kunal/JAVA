package Single_Loop;

import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int smallest = (n1 < n2) ? n1 : n2;

        while (true) {
            if (n1 % smallest == 0 && n2 % smallest == 0) {
                System.out.println("The HCF of " + n1 + " and " + n2 + " is: " + smallest);
                break;
            } else {
                smallest--;
            }
        }
    }
}
