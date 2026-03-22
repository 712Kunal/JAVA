
class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("First 10 fibonacci numbers: ");

        int n1 = 0;
        int n2 = 1;
        int ans;

        System.out.println();

        for (int i = 0; i < 10; i++) {
            ans = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = ans;
        }
    }
}
