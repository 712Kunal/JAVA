
import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int num = sc.nextInt();
        System.out.print("Enter the exponential: ");
        int power = sc.nextInt();

        if (power < 0) {
            num = 1 / num;
            power = (-1) * power;
        }

        System.out.println();
        System.out.print("Using in built power method: ");
        powerUsingInbuilt(num, power);

        System.out.println();

        System.out.print("Using traditional method: ");
        powerUsingScratch(num, power);
    }

    public static void powerUsingInbuilt(int num, int power) {
        int ans = (int) Math.pow(num, power);
        System.out.println(ans);
    }

    public static void powerUsingScratch(int num, int power) {
        int powerOf = 1;
        for (int i = 0; i < power; i++) {
            powerOf *= num;
        }
        System.out.println(powerOf);
    }
}