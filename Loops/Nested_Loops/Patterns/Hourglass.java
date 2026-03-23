class Hourglass {
    public static void main(String[] args) {
        int n = 9;
        int star = n / 2 + 1;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*" + " ");
            }

            if (i < n / 2) {
                star--;
            } else {
                star++;
            }

            System.out.println();
        }
        System.out.println();
    }
}
