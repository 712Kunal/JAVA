
import java.util.Scanner;

class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int cnt = 0;
        for (int i = num; i > 0; i /= 10) {
            cnt++;
        }

        if (cnt % 2 == 0) {
            int pow = 1;
            for (int i = 0; i < cnt / 2; i++) {
                pow *= 10;
            }

            int lastNums = num % pow;
            int firstNums = num / pow;

            int sum = lastNums + firstNums;
            if (sum * sum == num) {
                System.out.println(num + " is a Tech Number");
            } else {
                System.out.println(num + " is not a Tech Number");
            }
        } else {
            System.out.println(num + " is not a Tech Number");
        }
    }
}
