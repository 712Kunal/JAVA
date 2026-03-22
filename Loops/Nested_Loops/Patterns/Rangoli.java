
class Rangoli {
    public static void main(String[] args) {
        System.out.println();
        int n = 21;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == j || ((i + j) == n - 1) || j == n - 1 || j == n / 2
                        || i == n / 2) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
