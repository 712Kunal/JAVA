
import java.util.Scanner;

class IsSpecialCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        char ch = sc.next().charAt(0);

        String result = (!((ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57))) ? (ch + " is a special character") : (ch + " is not a special character");

        System.out.println(result);
    }
}
