
import java.util.Scanner;

class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the number: ");
        int num = sc.nextInt();

        int den = 1;

        System.out.println();
        System.out.println("The factors of the " + num + " are: ");
        while (den <= num / 2) {
            if (num % den == 0) {
                System.out.println(den);
            }
            den++;
        }
        System.out.println(num);
    }
}
