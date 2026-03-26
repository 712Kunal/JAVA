
import java.util.Scanner;

class EVM {

    static int bjp, cong, ncp, mns, aap, nota;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the population of the state: ");
        int popu = sc.nextInt();

        for (int i = 1; i <= popu; i++) {
            System.out.println("\n******************* WELCOME *******************\n");
            System.out.println("1. BJP");
            System.out.println("2. CONG");
            System.out.println("3. MNS");
            System.out.println("4. NCP");
            System.out.println("5. AAP");
            System.out.println("6. NOTA");

            System.out.print("\nEnter the party to which you want to vote: ");
            String userIp = sc.next().toUpperCase();

            switch (userIp) {
                case "BJP": {
                    System.out.println("VOTED FOR THE BJP");
                    bjp++;
                    break;
                }
                case "MNS": {
                    System.out.println("VOTED FOR THE MNS");
                    mns++;
                    break;
                }
                case "NCP": {
                    System.out.println("VOTED FOR THE NCP");
                    ncp++;
                    break;
                }
                case "CONG": {
                    System.out.println("VOTED FOR THE CONG");
                    cong++;
                    break;
                }
                case "NOTA": {
                    System.out.println("VOTED FOR THE NOTA");
                    nota++;
                    break;
                }
                default: {
                    System.out.println("INVALID RESPONSE");
                    break;
                }
            }
        }

        System.out.println();

        if (bjp > mns && bjp > cong && bjp > aap && bjp > nota && bjp > ncp) {
            System.out.println("BJP HAS WON THE ELECTIONS WITH " + bjp + " VOTES");

        } else if (mns > bjp && mns > cong && mns > aap && mns > nota && mns > ncp) {
            System.out.println("MNS HAS WON THE ELECTIONS WITH " + mns + " VOTES");

        } else if (ncp > bjp && ncp > cong && ncp > aap && ncp > nota && ncp > mns) {
            System.out.println("NCP HAS WON THE ELECTIONS WITH " + ncp + " VOTES");

        } else if (cong > bjp && cong > mns && cong > aap && cong > nota && cong > ncp) {
            System.out.println("CONGRESS HAS WON THE ELECTIONS WITH " + cong + " VOTES");

        } else if (aap > bjp && aap > mns && aap > cong && aap > nota && aap > ncp) {
            System.out.println("AAP HAS WON THE ELECTIONS WITH " + aap + " VOTES");

        } else if (nota > bjp && nota > mns && nota > cong && nota > aap && nota > ncp) {
            System.out.println("NOTA HAS WON THE ELECTIONS WITH " + nota + " VOTES");

        } else {
            System.out.println("IT'S A TIE OR NO CLEAR WINNER");
        }
    }
}
