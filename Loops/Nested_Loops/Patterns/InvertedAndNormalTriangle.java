class InvertedAndNormalTriangle {
    public static void main(String[] args) {
        int n = 11;
        int star = n;
        int space = 0;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" " + " ");
            }

            for (int k = 0; k < star; k++) {
                System.out.print("*" + " ");
            }

            System.out.println();
            if (i < n / 2) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
        }
        System.out.println();
    }
}
