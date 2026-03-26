class HollowDiamound {
    public static void main(String[] args) {
        int n = 21;
        int space = n / 2;
        int innerSpaces = -1;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" " + " ");
            }

            System.out.print("*" + " ");

            if (innerSpaces >= 1) {
                for (int j = 0; j < innerSpaces; j++) {
                    System.out.print(" " + " ");
                }

                System.out.print("*" + " ");
            }

            if (i < n / 2) {
                space--;
                innerSpaces += 2;
            } else {
                space++;
                innerSpaces -= 2;
            }
            System.out.println();
        }
        System.out.println();
    }
}
