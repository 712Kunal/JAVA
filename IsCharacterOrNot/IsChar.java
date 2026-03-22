import java.util.Scanner;

class IsChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input: ");
        char ch = sc.next().charAt(0);

        String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? (ch + " is a alphabet") : (ch + " is not a alphabet");

        System.out.println(result);
    }
}
