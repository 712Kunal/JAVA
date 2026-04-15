class Descending {
    public static int descending(int num) {
        int descending = 0;

        for (int i = 9; i >= 0; i--) {
            for (int j = num; j > 0; j /= 10) {
                int last = j % 10;

                if (last == i) {
                    descending *= 10;
                    descending += last;
                }
            }
        }

        return descending;
    }

    public static void main(String[] args) {
        System.out.println(descending(123456789));
    }
}
