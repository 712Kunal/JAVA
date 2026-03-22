package Single_Loop;
class FibonacciNumbersInRange {
    public static void main(String[] args) {
        int start = 0;
        int end = 2000;

        int n1 = 0;
        int n2 = 1;
        int ans;

        System.out.println("Fibonacci numbers between the range " + start + " to " + end + " -> ");

        while (n1 <= end) {
            if (n1 >= start) {
                System.out.print(n1 + " ");
            }

            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
    }
}
