
import java.util.Scanner;

class IsUpperCaseOrLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input: ");
        char ch = sc.next().charAt(0);

        String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
                ? ((ch >= 65 && ch <= 90)
                        ? (ch + " is a uppercase character")
                        : (ch + " is a lowercase character"))
                : (ch + " is not a character");

        System.out.println(result);
    }
}
