
import java.util.ArrayList;
import java.util.Scanner;

class Bank {

    static String name;
    static long contact;
    static int pin;
    static double balance;
    static ArrayList<String> transactions = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BEGINING:
        while (true) {
            System.out.println("\n********* WELCOME TO LAXMI CHIT FUND *********\n");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println();
            System.out.print("Enter your response: ");
            int userResponse = sc.nextInt();
            sc.nextLine();

            switch (userResponse) {
                case 1: {
                    if (name != null) {
                        System.out.print("\nYour account already exist\n");
                        continue;
                    }
                    System.out.println("\n********* WELCOME TO REGISTER MODULE *********\n");
                    System.out.print("Enter your name: ");
                    name = sc.nextLine();
                    System.out.print("Enter your contact details: ");
                    contact = sc.nextLong();
                    System.out.print("Enter your pin: ");
                    pin = sc.nextInt();
                    System.out.print("Enter the account opening amount: ");
                    balance = sc.nextDouble();
                    transactions.add("Deposit: " + balance);
                    System.out.println();
                    System.out.println("\n*********** ACCOUNT CREATED SUCCESSFULLY ***********\n");
                    break;
                }

                case 2: {
                    if (name == null) {
                        System.out.println("First create your account");
                        continue;
                    }
                    System.out.println("\n********* WELCOME TO LOGIN MODULE *********\n");
                    System.out.print("Enter your contact number: ");
                    long userContact = sc.nextLong();
                    System.out.print("Enter your PIN number: ");
                    int userPin = sc.nextInt();

                    if (userContact == contact && userPin == pin) {
                        System.out.println("\n********* LOGGEDIN SUCCESSFULLY *********\n");
                        while (true) {
                            System.out.println("********* SELECT FEATURES *********");
                            System.out.println("1. Deposit");
                            System.out.println("2. Check Balance");
                            System.out.println("3. WithDraw");
                            System.out.println("4. Transactions");
                            System.out.println("5. Logout");
                            System.out.println();

                            System.out.print("Enter your response: ");
                            int userResponse1 = sc.nextInt();
                            switch (userResponse1) {
                                case 1: {
                                    System.out.println("********* DEPOSIT MODULE *********");
                                    System.out.print("Enter the amount to be deposited: ");
                                    double userAmount = sc.nextDouble();
                                    if (userAmount > 0) {
                                        balance += userAmount;
                                        transactions.add("Deposit: " + userAmount);
                                        System.out.println("Amount has been credited successfully");
                                    } else {
                                        System.out.println("Enter the valid amount");
                                        continue;
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("********* CHECK BALANCE MODULE *********");
                                    System.out.println("Your required balance is " + balance);
                                    break;
                                }
                                case 3: {
                                    System.out.print("Enter your pin first: ");
                                    int userPin1 = sc.nextInt();
                                    if (userPin1 == pin) {
                                        System.out.print("Enter the amount to be debited: ");
                                        double debitAmt = sc.nextDouble();
                                        if (debitAmt > 0 && debitAmt <= balance) {
                                            balance -= debitAmt;
                                            transactions.add("Debit: " + debitAmt);
                                            System.out.println("Amount debited successfully");
                                        } else {
                                            System.out.println("Insufficient funds");
                                        }
                                    } else {
                                        System.out.println("Invalid pin, please try again");
                                    }

                                    break;
                                }
                                case 4: {
                                    System.out.println("\n********* TRANSACTIONS MODULE *********\n");
                                    for (String ele : transactions) {
                                        System.out.println(ele);
                                    }
                                    System.out.println("Your account balance is " + balance);
                                    break;
                                }
                                case 5: {
                                    System.out.println("\n********* THANK YOU, VISIT AGAIN *********\n");
                                    continue BEGINING;
                                }
                                default: {
                                    System.out.println("********* INVALID RESPONSE *********");
                                    continue;
                                }
                            }
                        }
                    } else {
                        System.out.println("Invalid pin");
                    }
                    break;
                }

                default: {
                    System.out.println("********* INVALID RESPONSE *********");
                    continue;
                }
            }
        }
    }
}
