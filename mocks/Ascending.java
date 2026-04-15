class Ascending {
    public static int ascending(int num) {
        int ascending = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = num; j > 0; j /= 10) {
                int last = j % 10;

                if (last == i) {
                    ascending *= 10;
                    ascending += last;
                }
            }
        }

        return ascending;
    }

    public static void main(String[] args) {
        System.out.println(ascending(98765432));
    }
}