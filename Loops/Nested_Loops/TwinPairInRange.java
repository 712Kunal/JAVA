

class TwinPairInRange {
    public static void main(String[] args) {
        int start = 500;
        int end = 1000;

        for (int i = start; i <= end - 2; i++) {
            int firstNum = i;
            int secondNum = i + 2;

            boolean isFirstNumPrime = false;
            boolean isSecondNumPrime = false;

            int den = 2;
            while (den < firstNum) {
                if (firstNum % den == 0) {
                    break;
                }
                den++;
            }

            if (den == firstNum) {
                isFirstNumPrime = true;
                den = 2;
                while (den < secondNum) {
                    if (secondNum % den == 0) {
                        break;
                    }
                    den++;
                }

                if (den == secondNum) {
                    isSecondNumPrime = true;
                } else {
                    continue;
                }
            }

            if (isFirstNumPrime && isSecondNumPrime) {
                System.out.println(firstNum + " , " + secondNum);
            }
        }
    }
}