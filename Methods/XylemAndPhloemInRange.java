public class XylemAndPhloemInRange {
    public static boolean isXylem(int num) {
        if (num < 10) {
            return true;
        }

        int edgeSum = 0;

        edgeSum += num % 10;
        num /= 10;

        int middleSum = 0;
        while (num > 9) {
            middleSum += num % 10;
            num /= 10;
        }

        edgeSum += num;

        return edgeSum == middleSum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        while (start <= end) {
            boolean res = isXylem(start);
            if (res) {
                System.out.println(start + " => XYLEM");
            } else {
                System.out.println(start + " => PHLOEM");
            }
            start++;
        }
    }
}
