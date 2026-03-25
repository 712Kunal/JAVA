class NumberedRightAngleTriangle {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        System.out.println();
        for (int i = 0; i < n; i++) {
            int temp = num;
            int gap = n - 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp + gap;
                gap--;
            }
            System.out.println();
            num++;
        }
    }
}
