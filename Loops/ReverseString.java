
class ReverseString {

    public static void main(String[] args) {
        String str = "kunal";

        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + rev);

        System.out.println("\nUsing two pointer approac ->");
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if (ch1 != ch2) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
