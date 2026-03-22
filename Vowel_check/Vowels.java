
import java.util.Scanner;

class Vowels {

    public static void main(String[] args) {
        System.out.print("Enter the character: ");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toUpperCase().charAt(0);

        String res = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? (ch + " is a vowel") : (ch + " is a consonent");

        System.out.println(res);
    }
}
