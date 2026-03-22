package Single_Loop;

import java.util.Scanner;

class NPronicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int j = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(j * (j + 1));
            j++;
        }
    }
}
