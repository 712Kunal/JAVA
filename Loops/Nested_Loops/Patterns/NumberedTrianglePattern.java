class NumberedTrianglePattern {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1) {
                    System.out.print(" " + " ");
                } else if (j < n - 1) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(num + " ");
                    num--;
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}