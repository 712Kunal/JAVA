
import java.util.Scanner;

class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("\n*************** WELCOME ***************\n");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. KWD");
            System.out.println("4. GBP");
            System.out.println("5. CAD");
            System.out.println("6. ALL");
            System.out.println("7. DZD");
            System.out.println("8. AOA");
            System.out.println("9. ARS");
            System.out.println("10. AMD");
            System.out.println("11. AUD");
            System.out.println("11. AZN");
            System.out.println("12. BSD");
            System.out.println("13. BHD");
            System.out.println("14. BDT");
            System.out.println("14. BBD");
            System.out.println("15. BYN");
            System.out.println("16. BZD");
            System.out.println("17. BTC");
            System.out.print("Enter the currency to be converted in: ");
            String curr = sc.next().toUpperCase();

            System.out.print("Enter the amount in INR: ");
            double amount = sc.nextDouble();

            double convertedCurr = 0.0;

            if (curr.equals("USD")) {
                convertedCurr = amount / 90.70;
            } else if (curr.equals("EUR")) {
                convertedCurr = amount / 107.39;
            } else if (curr.equals("KWD")) {
                convertedCurr = amount / 296.08;
            } else if (curr.equals("GBP")) {
                convertedCurr = amount / 123.18;
            } else if (curr.equals("CAD")) {
                convertedCurr = amount / 66.481;
            } else if (curr.equals("ALL")) {
                convertedCurr = amount / 1.1138;
            } else if (curr.equals("DZD")) {
                convertedCurr = amount / 0.6991;
            } else if (curr.equals("ARS")) {
                convertedCurr = amount / 0.06483;
            } else if (curr.equals("AMD")) {
                convertedCurr = amount / 0.2406;
            } else if (curr.equals("AUD")) {
                convertedCurr = amount / 64.122;
            } else if (curr.equals("AZN")) {
                convertedCurr = amount / 53.362;
            } else if (curr.equals("BSD")) {
                convertedCurr = amount / 90.716;
            } else if (curr.equals("BHD")) {
                convertedCurr = amount / 240.66;
            } else if (curr.equals("BDT")) {
                convertedCurr = amount / 0.7415;
            } else if (curr.equals("BBD")) {
                convertedCurr = amount / 45.361;
            } else if (curr.equals("BYN")) {
                convertedCurr = amount / 31.761;
            } else if (curr.equals("BZD")) {
                convertedCurr = amount / 45.361;
            } else if (curr.equals("BTC")) {
                convertedCurr = amount / 6183000;
            }

            System.out.printf("%n%.2f INR = %.4f %s%n", amount, convertedCurr, curr);
        }

    }
}
