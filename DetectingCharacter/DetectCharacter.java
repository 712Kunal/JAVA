
import java.util.Scanner;

class DetectCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Enter the character: ");
            char ch = sc.next().charAt(0);

            String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? ((ch >= 65 && ch <= 90) ? ("It's a uppercase alphabet") : ("It's a lowercase alphabet")) : ((ch >= 48 && ch <= 57) ? ("It's a digit") : ("It's a special character"));

            System.out.println(result);
        }
    }
}
