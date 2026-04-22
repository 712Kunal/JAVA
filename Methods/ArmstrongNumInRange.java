class ArmstrongNumInRange {
    public static int pow(int num, int power) {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow *= num;
        }

        return pow;
    }

    public static int ArmstrongNum(int num) {

        // using the method numLength from the TechNumberInRange class
        int len = TechNumberInRange.numLength(num);
        int sum = 0;

        for (int i = num; i > 0; i /= 10) {
            int last = i % 10;
            sum += pow(last, len);
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
            int res = ArmstrongNum(start);

            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
