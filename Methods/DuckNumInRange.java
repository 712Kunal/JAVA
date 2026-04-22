class DuckNumInRange {
    public static int duckNum(int num) {
        int copy = num;

        while (copy > 0) {
            int last = copy % 10;

            if (last == 0) {
                return num;
            }

            copy /= 10;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 500;
        int end = 1000;

        while (start <= end) {
            int res = duckNum(start);

            if (res != -1) {
                System.out.println(res);
            }

            start++;
        }
    }
}
