
import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;

        for (int i = num; i > 0; i /= 10) {
            int lstDgt = i % 10;

            rev = rev * 10 + lstDgt;
        }

        System.out.println("Reversed number is " + rev);

        if (rev == num) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
