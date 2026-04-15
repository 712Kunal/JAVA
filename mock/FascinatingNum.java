class FascinatingNum {
    public static boolean isFascinating(int num) {
        int len = 0;
        for (int i = num; i > 0; i /= 10) {
            len++;
        }

        if (len == 3) {
            int twoMultiple = num * 2;
            int threeMultiple = num * 3;

            int twoDivi = 1;
            for (int i = twoMultiple; i > 0; i /= 10) {
                twoDivi *= 10;
            }

            int threeDivi = 1;
            for (int i = threeMultiple; i > 0; i /= 10) {
                threeDivi *= 10;
            }

            int merged = 0;
            merged += num;

            merged *= twoDivi;
            merged += twoMultiple;

            merged *= threeDivi;
            merged += threeMultiple;

            System.out.println("Merged Number = " + merged);

            for (int i = 1; i <= 9; i++) {
                int cnt = 0;
                int j = merged;

                while (j > 0) {
                    int last = j % 10;
                    if (last == i) {
                        cnt++;
                    }
                    j /= 10;
                }

                if (cnt > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isFascinating(192));
    }
}