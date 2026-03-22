
import java.util.Scanner;

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            Thread.sleep(200);
        }
    }
}
