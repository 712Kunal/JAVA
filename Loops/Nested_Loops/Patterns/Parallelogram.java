class Parallelogram {
    public static void main(String[] args) {
        int n = 10;
        int space = 0;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }

            space++;
            System.out.println();
        }
    }
}
