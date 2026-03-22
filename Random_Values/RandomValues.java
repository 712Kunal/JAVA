
class RandomValues {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int randomValues = (int) (Math.random() * 100);
            System.out.println(randomValues);
        }
    }
}
