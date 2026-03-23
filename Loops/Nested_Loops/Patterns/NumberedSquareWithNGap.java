class NumberedSquareWithNGap {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        System.out.println();
        for (int i = 0; i < n; i++) {
            int temp = num;
            for (int j = 0; j < n; j++) {
                System.out.print(temp + " ");
                temp += n;
            }
            num++;
            System.out.println();
        }
        System.out.println();
    }
}
