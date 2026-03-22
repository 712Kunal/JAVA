
import java.util.Scanner;

class LoopsAssignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int num = sc.nextInt();

        System.out.print("The digits from the end: ");
        for (int i = num; i > 0; i /= 10) {
            int lstDgt = i % 10;
            System.out.print(lstDgt + " ");
        }

        System.out.println();
        System.out.println();

        int len = 0;
        for (int i = num; i > 0; i /= 10) {
            len++;
        }

        System.out.println("The length of digits " + num + " is " + len);

        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            int lstDgt = i % 10;
            sum += lstDgt;
        }

        System.out.println("The sum of digits " + num + " is " + sum);

        System.out.println();
        System.out.println();

        int eSum = 0;
        int oSum = 0;
        for (int i = num; i > 0; i /= 10) {
            int lstDgt = i % 10;
            if (lstDgt % 2 == 0) {
                eSum += i;
            } else {
                oSum += i;
            }
        }

        System.out.println("The sum of even digits is " + eSum);
        System.out.println("The sum of odd digits is " + oSum);

        System.out.println();
        System.out.println();

        int product = 1;
        for (int i = num; i > 0; i /= 10) {
            int lstDgt = i % 10;
            product *= lstDgt;
        }

        System.out.println("The product of digits is " + product);

        System.out.println();
        System.out.println();

        int divi = 1;
        for (int i = num; i > 0; i /= 10) {
            divi *= 10;
        }

        System.out.println("The divisor of the number " + num + " is " + divi);

        System.out.println();
        System.out.println();

        int divi1 = 1;
        for (int i = num; i > 0; i /= 10) {
            divi1 *= 10;
        }

        System.out.println(divi1);

        System.out.println("The digits from the begining: ");
        for (int i = num; i != 0; i %= divi1) {
            divi1 /= 10;
            int frstDgt = i / divi1;
            System.out.print(frstDgt + " ");
        }

        System.out.println();
        System.out.println();

        int divi2 = 1;
        for (int i = num; i > 0; i /= 10) {
            divi2 *= 10;
        }

        String word = "";
        for (int i = num; i != 0; i %= divi2) {
            divi2 /= 10;
            int frstDgt = i / divi2;

            word = switch (frstDgt) {
                case 1 ->
                    word + "One ";
                case 2 ->
                    word + "Two ";
                case 3 ->
                    word + "Three ";
                case 4 ->
                    word + "Four ";
                case 5 ->
                    word + "Five ";
                case 6 ->
                    word + "Six ";
                case 7 ->
                    word + "Seven ";
                case 8 ->
                    word + "Eight ";
                case 9 ->
                    word + "Nine ";
                default ->
                    word;
            };
        }
        System.out.print("The words are: ");
        System.out.println(word);
        System.out.println();
    }
}
