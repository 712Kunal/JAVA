
import java.util.Scanner;

class SumAndProductOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int duplicate = num;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println("Sum of digits of " + duplicate + " = " + sum);

        int prod = 1;
        int forProdDuplicate = duplicate;
        while (forProdDuplicate != 0) {
            int lastDigit = forProdDuplicate % 10;
            prod *= lastDigit;
            forProdDuplicate /= 10;
        }

        System.out.println("Product of digits of " + duplicate + " = " + prod);

    }
}
