
class IsLeapYearOrNotInRange {
    public static void main(String[] args) {
        int start = 1000;

        System.out.println("Leap Years in between " + start + " and 2000 are: ");
        System.out.print("{ ");
        while (start <= 2000) {
            IsLeapYear(start);
            start++;
        }
        System.out.print(" }");
    }

    public static void IsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print(year + " ,");
        } else if (year % 400 == 0) {
            System.out.print(year + " ,");
        }
    }
}
