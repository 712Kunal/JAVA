public class PerfectNumberInRange {
    public static int perfectNum(int num) {
        int divi = 1;
        int factorSum = 0;

        while (divi <= num / 2) {
            if (num % divi == 0) {
                factorSum += divi;
            }
            divi++;
        }

        if (factorSum == num) {
            return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        while (start <= end) {
            int res = perfectNum(start);

            if (res != -1) {
                System.out.println(res);
            }
            start++;
        }
    }
}
