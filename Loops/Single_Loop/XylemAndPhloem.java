import java.util.Scanner;

class XylemAndPhloem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("It's a Xylem number");
            return;
        }

        int endSum = num % 10;
        num /= 10;

        int middleSum = 0;

        while (num > 9) {
            middleSum += num % 10;
            num /= 10;
        }

        endSum += num;

        if (middleSum == endSum) {
            System.out.println("It's a Xylem number");
        } else {
            System.out.println("It's a Phloem number");
        }
    }
}
