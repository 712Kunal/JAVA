class DisarriumNumInRange {
    public static int disarrimNum(int num) {
        // used numLength method imported from the TechNumberInRange class
        int len = TechNumberInRange.numLength(num);
        int sum = 0;

        for (int i = num; i > 0; i /= 10) {
            int last = i % 10;
            // used pow method imported from the ArmstrongNumInRange class
            int power = ArmstrongNumInRange.pow(last, len);
            sum += power;
            len--;
        }

        if (sum == num) {
            return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 500;

        while (start <= end) {
            int res = disarrimNum(start);

            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
