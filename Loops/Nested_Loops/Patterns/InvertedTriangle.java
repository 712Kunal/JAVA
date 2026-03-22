class InvertedTriangle {
    public static void main(String[] args) {
        int n = 10;
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < i || j >= (2 * n - i - 1)) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }

            System.out.println();
        }
    }
}
