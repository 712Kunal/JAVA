class Diagnoal1sAndStarsSquare {
    public static void main(String[] args) {
        int n = 15;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n-1) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
