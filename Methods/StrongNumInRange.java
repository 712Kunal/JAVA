class StrongNumInRange {
    public static int factorial(int num) {
        int fact = 1;

        while (num > 0) {
            fact *= num;
            num--;
        }

        return fact;
    }

    public static int strongNum(int num) {
        int copy = num;
        int sum = 0;

        while (copy > 0) {
            sum += factorial(copy % 10);
            copy /= 10;
        }

        if (sum == num) {
            return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 200;

        while (start <= end) {
            int res = strongNum(start);

            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
