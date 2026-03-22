
import java.util.Scanner;

class LoopsAssignment11 {

    public static void main(String[] args) {
        System.out.println("PRINTING z TO a -> ");
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING Aa TO Zz -> ");
        for (char ch1 = 'A', ch2 = 'a'; ch1 <= 'Z'; ch1++, ch2++) {
            System.out.print(ch1 + "" + ch2 + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING Az TO Za -> ");
        for (char ch1 = 'A', ch2 = 'z'; ch1 <= 'Z'; ch1++, ch2--) {
            System.out.print(ch1 + "" + ch2 + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING A65 TO Z90 -> ");
        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            System.out.print(ch1 + "" + (ch1 + 0) + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING 1 to 100 NUMBERS -> ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING 100 TO 50 -> ");
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING 100 TO 1 ODD NUMBERS -> ");
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING 1 TO 100 EVEN NUMBERS -> ");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING DIGITS FROM 0 TO 9 -> ");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch + " -> " + (ch + 0) + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING THE PATTERN ACFJOU -> ");
        int dist = 1;
        for (char ch = 'A'; ch <= 'Z'; ch += dist) {
            System.out.print(ch + " ");
            dist++;
        }

        System.out.println();
        System.out.println();

        System.out.println("TAKING THE USER INPUT -> ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start: ");
        int start = sc.nextInt();
        System.out.print("Enter the end: ");
        int end = sc.nextInt();

        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = end; i <= start; i++) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("PRINTING THE A TO Z VOWELS AND CONSONENTS -> ");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U': {
                    System.out.println(ch + " is a vowel");
                    break;
                }
                default: {
                    System.out.println(ch + " is a consonent");
                    break;
                }
            }
        }
    }
}
