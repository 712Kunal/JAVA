class BuzzNumberInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        while (start <= end) {
            IsBuzzNumber(start);
            start++;
        }
    }

    public static void IsBuzzNumber(int num) {
        int lastDigit = num % 10;

        if (num % 7 == 0 || lastDigit == 7) {
            System.out.print(num + " ,");
        }
    }
}
