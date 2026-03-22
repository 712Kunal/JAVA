
import java.util.Scanner;

class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextInt();
        System.out.println();
        System.out.print("Enter the power: ");
        double power = sc.nextInt();

        if (power < 0) {
            num = 1 / num;
            power = power * (-1);
        }

        System.out.println("Using power method ->");
        System.out.print("Power of number = " + Math.pow(num, power));

        System.out.println();
        System.out.println("Using scratch impelementation");
        double powerOf = 1;
        for (int i = 0; i < power; i++) {
            powerOf *= num;
        }
        System.out.println("Power of number = " + powerOf);
    }
}
