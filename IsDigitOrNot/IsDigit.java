
import java.util.Scanner;

class IsDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= 48 && ch <= 57) ? (ch + " is a digit") : (ch + " is not a digit");

        System.out.println(result);
    }
}
