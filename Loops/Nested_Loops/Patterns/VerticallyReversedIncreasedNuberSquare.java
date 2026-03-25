class VerticallyReversedIncreasedNuberSquare {
    public static void main(String[] args) {
        int n = 4;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int start = j * n + 1;

                if (j % 2 == 0) {
                    System.out.print(start + i + " ");
                } else {
                    System.out.print(start + (n - i - 1) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}