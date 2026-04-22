class TechNumberInRange {
    public static int numLength(int num) {
        int cnt = 0;

        for (int i = num; i > 0; i /= 10) {
            cnt++;
        }

        return cnt;
    }

    public static int techNumber(int num) {
        int len = numLength(num);

        if (len % 2 == 0) {
            int pow = 1;
            for (int i = 0; i < len / 2; i++) {
                pow *= 10;
            }

            int firstNum = num / pow;
            int secondNum = num % pow;

            int sum = firstNum + secondNum;
            if ((sum * sum) == num) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 10000;

        while (start <= end) {
            int res = techNumber(start);
            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
