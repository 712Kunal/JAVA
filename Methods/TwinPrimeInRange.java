public class TwinPrimeInRange {
    public static boolean isPrime(int num) {
        int den = 2;

        while (den < num) {
            if (num % den == 0) {
                break;
            }

            den++;
        }

        if (den == num) {
            return true;
        }

        return false;
    }

    public static void twinPrimes(int start, int end) {

        for (int i = start; i <= end - 2; i++) {
            int firstNum = i;
            int secondNum = i + 2;

            if (isPrime(firstNum) && isPrime(secondNum)) {
                System.out.println("(" + firstNum + ", " + secondNum + ")");
            }
        }
    }

    public static void main(String[] args) {
        int start = 500;
        int end = 1000;

        twinPrimes(start, end);
    }
}
