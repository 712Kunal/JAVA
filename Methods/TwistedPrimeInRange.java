class TwistedPrimeInRange {
    public static int twistedPrime(int num) {
        int den = 2;

        while (den < num) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (den == num) {
            int rev = 0;
            int copy = num;

            while (copy != 0) {
                int digit = copy % 10;
                rev = rev * 10 + digit;
                copy /= 10;
            }

            den = 2;
            while (den < rev) {
                if (rev % den == 0) {
                    break;
                }
                den++;
            }

            if (den == rev) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        System.out.println("Twisted Prime Numbers are: ");

        while (start <= end) {
            int res = twistedPrime(start);
            if (res != -1) {
                System.out.println(res);
            }
            start++;
        }
    }
}