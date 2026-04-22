class AutomorphicInRange {
    public static int automorphicNum(int num) {
        int squaredNum = num * num;

        // used numLength method imported from the TechNumberInRange class
        int len = TechNumberInRange.numLength(num);

        int pow = 1;
        for (int i = 0; i < len; i++) {
            pow *= 10;
        }

        int extractedLastNum = squaredNum % pow;
        if (extractedLastNum == num) {
            return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 200;
        int end = 10000;

        while (start <= end) {
            int res = automorphicNum(start);
            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
