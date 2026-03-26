
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("************** WELCOME **************");
            System.out.print("Enter the first operand: ");
            double op1 = sc.nextDouble();
            System.out.print("Enter the operand: ");
            char operand = sc.next().charAt(0);
            System.out.print("Enter the second operand: ");
            double op2 = sc.nextDouble();

            double result = 0;
            result = (operand == '+') ? (op1 + op2) : ((operand == '-') ? (op1 - op2) : ((operand == '*') ? (op1 * op2) : ((operand == '%') ? (op1 % op2) : ((operand == '/') ? (op1 / op2) : (Double.MAX_VALUE)))));

            if (result == Double.MAX_VALUE) {
                System.out.println("INVALID OPERATOR");
            } else {
                System.out.println(op1 + " " + operand + " " + op2 + " = " + String.format("%.3f", result));
            }
        }

    }
}
