
class ForLoopExecution {

    public static void main(String[] args) {
        System.out.println("Execution starts: ");

        int i = 1;
        for (System.out.println("initialization"); i <= 5; System.out.println(i + " updation")) {
            System.out.println(i + " condition true");
            System.out.println(i + " has performed the task\n");
            i++;
        }

        System.out.println("Execution ends");

        System.out.println();
        System.out.println();

        System.out.println("A - ASCII VALUE TO Z - ASCII VALUE");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " - " + (ch + 0) + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("ODD NUMBERS: ");
        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'A') {
                System.out.print(ch + " ");
            } else if (ch == 'C') {
                System.out.print(ch + " ");
            } else if (ch == 'F') {
                System.out.print(ch + " ");
            } else if (ch == 'O') {
                System.out.print(ch + " ");
            } else if (ch == 'U') {
                System.out.print(ch + " ");
            }
        }

        
    }
}
