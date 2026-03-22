package Single_Loop;

class TwistedPrimeNumber {
    public static void main(String[] args) {
        int num = 13;
        int den = 2;

        while (den < num) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (den == num) {
            int copy = 0;

            for (int i = num; i > 0; i /= 10) {
                copy *= 10;
                copy += i % 10;
            }

            den = 2;

            while (den < copy) {
                if (copy % den == 0) {
                    break;
                }
                den++;
            }

            if (den == copy) {
                System.out.println(num + " is a twisted prime number");
            } else {
                System.out.println(num + " is not a twisted prime number");
            }
        } else {
            System.out.println(num + " is not a twisted prime number");
        }
    }
}
