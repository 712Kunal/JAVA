package Single_Loop;

import java.util.Scanner;

class SearchADigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to be searched: ");
        int dgt = sc.nextInt();

        int i = num;
        while (i > 0) {
            int lastDgt = i % 10;
            if (lastDgt == dgt) {
                System.out.println(dgt + " is found in the number " + num);
                break;
            }
            i /= 10;
        }

        if (i == 0) {
            System.out.println(dgt + " doesnt found in the number " + num);
        }
    }
}
