
import java.util.Scanner;

class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 1;
        while (true) {
            if (i * (i + 1) == num) {
                System.out.println(num + " is a pronic number");
                break;
            } else if (i * (i + 1) > num) {
                System.out.println(num + " is not a pronic number");
                break;
            } else {
                i++;
            }
        }
    }
}