
import java.util.Scanner;

class LCM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int i = 1;
        int large = (n1 > n2) ? n1 : n2;

        while (true) {
            if ((large * i) % n1 == 0 && (large * i) % n2 == 0) {
                System.out.println("The LCM Of " + n1 + " and " + n2 + " is: " + (large * i));
                break;
            } else {
                i++;
            }
        }
    }
}
