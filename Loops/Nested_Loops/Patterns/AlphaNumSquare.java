class AlphaNumSquare {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        char ch = 'a';

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
