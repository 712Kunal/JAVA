public class NeonNumberInRange {
    public static int neonNum(int num) {
        int squared = num * num;

        int sum = 0;
        while (squared > 0) {
            sum += (squared % 10);
            squared /= 10;
        }

        if (sum == num) {
            return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        while (start <= end) {
            int res = neonNum(start);

            if (res != -1) {
                System.out.println(res);
            }
            start++;
        }
    }
}
