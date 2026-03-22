
import java.util.Scanner;

class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int botCnt = 0;
        int userCnt = 0;

        while (true) {
            System.out.println("\n ******************** WELCOME ********************\n");

            System.out.println("1. STONE");
            System.out.println("2. PAPER");
            System.out.println("3. SCISSOR");

            System.out.println("Enter the user's input: ");
            int userIp = sc.nextInt();

            System.out.println("");
            String userChoice = "";
            if (userIp == 1) {
                System.out.println("USER'S INPUT -> STONE");
                userChoice = "STONE";
            } else if (userIp == 2) {
                System.out.println("USER'S INPUT -> PAPER");
                userChoice = "PAPER";
            } else if (userIp == 3) {
                System.out.println("USER'S INPUT -> SCISSOR");
                userChoice = "SCISSOR";
            } else {
                System.out.println("INVALID USER'S INPUT");
                continue;
            }

            int dgt = 0;
            for (int i = 0; i < 100; i++) {
                int result = (int) (Math.random() * 10);

                if (result > 0 && result <= 3) {
                    dgt = result;
                    break;
                }
            }

            System.out.println("");
            String botsChoice = "";
            if (dgt == 1) {
                System.out.println("BOT'S INPUT -> STONE");
                botsChoice = "STONE";
            } else if (dgt == 2) {
                System.out.println("BOT'S INPUT -> PAPER");
                botsChoice = "PAPER";
            } else if (dgt == 3) {
                System.out.println("BOT'S INPUT -> SCISSOR");
                botsChoice = "SCISSOR";
            }

            if ((botsChoice.equals("STONE") && userChoice.equals("SCISSOR")) || (botsChoice.equals("PAPER") && userChoice.equals("STONE")) || (botsChoice.equals("SCISSOR") && userChoice.equals("PAPER"))) {
                botCnt++;
                System.out.println("        BOT WON         ");
            } else if ((botsChoice.equals("SCISSOR") && userChoice.equals("STONE")) || (botsChoice.equals("STONE") && userChoice.equals("PAPER")) || (botsChoice.equals("PAPER") && userChoice.equals("SCISSOR"))) {
                userCnt++;
                System.out.println("        USER WON         ");
            } else {
                System.out.println("        DRAW           ");
            }

            System.out.println("\n ******************** RESULT ********************\n");
            System.out.println("BOT'S SCORE: " + botCnt);
            System.out.println("USER'S SCORE: " + userCnt);
        }
    }
}
