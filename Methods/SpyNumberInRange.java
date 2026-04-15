public class SpyNumberInRange {
    public static int spyNum(int num) {
        int sum = 0;
        int i = num;

        while (i > 0) {
            sum += (i % 10);
            i /= 10;
        }

        int prod = 1;
        int j = num;

        while (j > 0) {
            prod *= (j % 10);
            j /= 10;
        }

        if (sum == prod) {
            return num;
        }

        return -1; 
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        while (start <= end) {
            int res = spyNum(start);

            if (res != -1) { 
                System.out.println(res);
            }

            start++;
        }
    }
}