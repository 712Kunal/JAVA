
import java.util.Scanner;

class LCM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int n2 = sc.nextInt();

        int large = (n1 > n2) ? n1 : n2;

        while (true) {
            if (large % n1 == 0 && large % n2 == 0) {
                System.out.println("LCM of " + n1 + " and " + n2 + " is: " + large);
                break;
            } else {
                large++;
            }
        }
    }
}
