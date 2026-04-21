public class FibonacciPattern {
    public static int nthFibo(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }

        int n1 = 0;
        int n2 = 1;
        int cnt = 2;
        int ans;

        while (true) {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
            cnt++;

            if (cnt == num) {
                return n2;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int total = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("\t");
                } else {
                    System.out.print(nthFibo(total) + "\t");
                    total--;
                }
            }
            System.out.println();
        }
    }
}