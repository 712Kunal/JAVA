class UglyNumInRange {
    public static int uglyNum(int num) {
        int copy = num;

        while (copy > 1) {
            if (copy % 2 == 0) {
                copy /= 2;
            } else if (copy % 3 == 0) {
                copy /= 3;
            } else if (copy % 5 == 0) {
                copy /= 5;
            }
        }

        if (copy == 1) {
            return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 500;
        int end = 1000;

        while (start <= end) {
            int res = uglyNum(start);
            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
