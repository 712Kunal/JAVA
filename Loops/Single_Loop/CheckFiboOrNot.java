import java.util.Scanner;

class CheckFiboOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int ans;

        while (n1 <= num) {
            ans = n1 + n2;
            if (n1 == num) {
                System.out.println(num + " is a fibonacci number");
                break;
            }

            n1 = n2;
            n2 = ans;
        }

        if (n1 != num) {
            System.out.println(num + " is not a fibonacci number");
        }
    }
}