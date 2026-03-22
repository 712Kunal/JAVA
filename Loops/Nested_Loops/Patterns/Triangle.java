class Triangle {
    public static void main(String[] args) {
        int n = 10;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
