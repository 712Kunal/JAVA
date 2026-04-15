class Frequency {
    public static void frequencyDgts(int num) {
        for (int i = 1; i <= 9; i++) {
            int cnt = 0;
            int j = num;

            while (j > 0) {
                int last = j % 10;
                if (last == i) {
                    cnt++;
                }
                j/=10;
            }

            System.out.println(i + " => " + cnt);
        }
    }

    public static void main(String[] args) {
        frequencyDgts(112445555);
    }
}