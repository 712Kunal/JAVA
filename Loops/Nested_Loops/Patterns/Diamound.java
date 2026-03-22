class Diamound {
    public static void main(String[] args) {
        int n = 11;

        int star = 1;
        int space = n / 2;

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();

            if (i < n / 2) {
                star += 2;
                space--;
            } else {
                space++;
                star -= 2;
            }
        }

        System.out.println();
    }
}
