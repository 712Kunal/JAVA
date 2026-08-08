package arrays;

import java.util.Scanner;

public class Assignment2 {

    static Scanner sc = new Scanner(System.in);

    static char[] ch = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};

    static int[] arr = {12,5,8,9,16,24,7,18,20};

    public static void main(String[] args) {

        //inputCharacters();
        printVowels();
        printConsonants();
        printUppercaseCharacters();
        printLowercaseCharacters();
        printSpecialCharacters();
        printAlphabetCharacters();
        printDigitCharacters();
        printReverseCharacters();
        printEvenIndexCharacters();
        printOddIndexCharacters();      // Q11
        printVowelIndexes();            // Q12
        printConsonantIndexes();        // Q13
        printUppercaseIndexes();        // Q14
        printLowercaseIndexes();        // Q15
        printSpecialCharacterIndexes(); // Q16
        printAlphabetIndexes();         // Q17
        printFirstThreeCharacters();    // Q18
        printLastThreeCharacters();     // Q19
        printMiddleTwoCharacters();     // Q20
        sumOfAsciiValues();          // Q21
        sumOfEvenAsciiValues();      // Q22
        sumOfOddAsciiValues();       // Q23
        averageAsciiValues();        // Q24
        productOfAsciiValues();      // Q25
        productOfEvenAsciiValues();  // Q26
        productOfOddAsciiValues();   // Q27
        printFirstVowel();           // Q28
        printFirstConsonant();       // Q29
        printFirstUppercase();       // Q30
        printFirstLowercase();         // Q31
        printFirstSpecialCharacter();  // Q32
        printFirstDigit();             // Q33
        printLastVowel();              // Q34
        printLastConsonant();          // Q35
        printLastDigit();              // Q36
        printLastUppercase();          // Q37
        printLastLowercase();          // Q38
        printLastSpecialCharacter();   // Q39
        printDivisibleBy3Or4();        // Q40
        
    }

    // Q1. Store characters from user and print them
    public static void inputCharacters() {

        System.out.println("inputCharacters");

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        char[] arr = new char[size];

        System.out.println("Enter Characters:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.print("Characters: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
    }

    // Q2. Print only vowels
    public static void printVowels() {

        System.out.println("printVowels");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                System.out.print(c + " ");
            }
        }

        System.out.println("\n");
    }

    // Q3. Print only consonants
    public static void printConsonants() {

        System.out.println("printConsonants");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {

                if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                      c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {

                    System.out.print(c + " ");
                }
            }
        }

        System.out.println("\n");
    }

    // Q4. Print only uppercase characters
    public static void printUppercaseCharacters() {

        System.out.println("printUppercaseCharacters");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'A' && ch[i] <= 'Z') {

                System.out.print(ch[i] + " ");
            }
        }

        System.out.println("\n");
    }

    // Q5. Print only lowercase characters
    public static void printLowercaseCharacters() {

        System.out.println("printLowercaseCharacters");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'a' && ch[i] <= 'z') {

                System.out.print(ch[i] + " ");
            }
        }

        System.out.println("\n");
    }
    
 // Q6. Print only special characters
    public static void printSpecialCharacters() {

        System.out.println("printSpecialCharacters");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (!((c >= 'A' && c <= 'Z') ||
                  (c >= 'a' && c <= 'z') ||
                  (c >= '0' && c <= '9'))) {

                System.out.print(c + " ");
            }
        }

        System.out.println("\n");
    }
    
 // Q7. Print only alphabet characters
    public static void printAlphabetCharacters() {

        System.out.println("printAlphabetCharacters");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if ((c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z')) {

                System.out.print(c + " ");
            }
        }

        System.out.println("\n");
    }
    
 // Q8. Print only digit characters
    public static void printDigitCharacters() {

        System.out.println("printAlphabetCharacters ");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= '0' && ch[i] <= '9') {

                System.out.print(ch[i] + " ");
            }
        }

        System.out.println("\n");
    }
    
 // Q9. Print characters in reverse order
    public static void printReverseCharacters() {

        System.out.println("printReverseCharacters ");

        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.print(ch[i] + " ");
        }

        System.out.println("\n");
    }
    
 // Q10. Print even index characters
    public static void printEvenIndexCharacters() {

        System.out.println("printReverseCharacters ");

        for (int i = 0; i < ch.length; i++) {

            if (i % 2 == 0) {

                System.out.print(ch[i] + " ");
            }
        }

        System.out.println("\n");
    }
    
 // Q11. Print Odd Index Characters
    public static void printOddIndexCharacters() {

        System.out.println("printOddIndexCharacters ");

        for (int i = 0; i < ch.length; i++) {

            if (i % 2 != 0) {
                System.out.print(ch[i] + " ");
            }
        }

        System.out.println("\n");
    }

    // Q12. Print Vowel Indexes
    public static void printVowelIndexes() {

        System.out.println("printVowelIndexes ");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }

    // Q13. Print Consonant Indexes
    public static void printConsonantIndexes() {

        System.out.println("printConsonantIndexes ");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {

                if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                      c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {

                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\n");
    }

    // Q14. Print Uppercase Indexes
    public static void printUppercaseIndexes() {

        System.out.println("printUppercaseIndexes ");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }

    // Q15. Print Lowercase Indexes
    public static void printLowercaseIndexes() {

        System.out.println("printLowercaseIndexes ");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'a' && ch[i] <= 'z') {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }

    // Q16. Print Special Character Indexes
    public static void printSpecialCharacterIndexes() {

        System.out.println("printSpecialCharacterIndexes ");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (!((c >= 'A' && c <= 'Z') ||
                  (c >= 'a' && c <= 'z') ||
                  (c >= '0' && c <= '9'))) {

                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }

    // Q17. Print Alphabet Indexes
    public static void printAlphabetIndexes() {

        System.out.println("printAlphabetIndexes ");

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if ((c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z')) {

                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }

    // Q18. Print First Three Characters
    public static void printFirstThreeCharacters() {

        System.out.println("printFirstThreeCharacters ");

        for (int i = 0; i < 3 && i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        System.out.println("\n");
    }

    // Q19. Print Last Three Characters
    public static void printLastThreeCharacters() {

        System.out.println("printFirstThreeCharacters ");

        for (int i = ch.length - 3; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        System.out.println("\n");
    }

    // Q20. Print Middle Two Characters (Even Length Array)
    public static void printMiddleTwoCharacters() {

        System.out.println("printMiddleTwoCharacters ");

        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};

        int mid = arr.length / 2;

        System.out.print(arr[mid - 1] + " ");
        System.out.print(arr[mid]);
        System.out.println();
    }
    
    public static void sumOfAsciiValues() {

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            sum = sum + ch[i];
        }

        System.out.println("Sum = " + sum);
    }

    // Q22
    public static void sumOfEvenAsciiValues() {

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 == 0) {
                sum = sum + ch[i];
            }
        }

        System.out.println("Even ASCII Sum = " + sum);
    }

    // Q23
    public static void sumOfOddAsciiValues() {

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 != 0) {
                sum = sum + ch[i];
            }
        }

        System.out.println("Odd ASCII Sum = " + sum);
    }

    // Q24
    public static void averageAsciiValues() {

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            sum += ch[i];
        }

        double avg = (double) sum / ch.length;

        System.out.println("Average = " + avg);
    }

    // Q25
    public static void productOfAsciiValues() {

        long product = 1;

        for (int i = 0; i < ch.length; i++) {
            product = product * ch[i];
        }

        System.out.println("Product = " + product);
    }

    // Q26
    public static void productOfEvenAsciiValues() {

        long product = 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 == 0) {
                product = product * ch[i];
            }
        }

        System.out.println("Even ASCII Product = " + product);
    }

    // Q27
    public static void productOfOddAsciiValues() {

        long product = 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 != 0) {
                product = product * ch[i];
            }
        }

        System.out.println("Odd ASCII Product = " + product);
    }

    // Q28
    public static void printFirstVowel() {

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                System.out.println("First Vowel = " + c);
                break;
            }
        }
    }

    // Q29
    public static void printFirstConsonant() {

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {

                if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                      c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {

                    System.out.println("First Consonant = " + c);
                    break;
                }
            }
        }
    }

    // Q30
    public static void printFirstUppercase() {

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'A' && ch[i] <= 'Z') {

                System.out.println("First Uppercase = " + ch[i]);
                break;
            }
        }
    }
    
 // Q31
    public static void printFirstLowercase() {

        for(int i=0;i<ch.length;i++){

            if(ch[i]>='a' && ch[i]<='z'){

                System.out.println("First Lowercase : "+ch[i]);
                break;
            }
        }
    }

    // Q32
    public static void printFirstSpecialCharacter() {

        for(int i=0;i<ch.length;i++){

            char c=ch[i];

            if(!((c>='A'&&c<='Z')||
                 (c>='a'&&c<='z')||
                 (c>='0'&&c<='9'))){

                System.out.println("First Special Character : "+c);
                break;
            }
        }
    }

    // Q33
    public static void printFirstDigit() {

        for(int i=0;i<ch.length;i++){

            if(ch[i]>='0' && ch[i]<='9'){

                System.out.println("First Digit : "+ch[i]);
                break;
            }
        }
    }

    // Q34
    public static void printLastVowel() {

        for(int i=ch.length-1;i>=0;i--){

            char c=ch[i];

            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
               c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

                System.out.println("Last Vowel : "+c);
                break;
            }
        }
    }

    // Q35
    public static void printLastConsonant() {

        for(int i=ch.length-1;i>=0;i--){

            char c=ch[i];

            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){

                if(!(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
                     c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){

                    System.out.println("Last Consonant : "+c);
                    break;
                }
            }
        }
    }

    // Q36
    public static void printLastDigit() {

        for(int i=ch.length-1;i>=0;i--){

            if(ch[i]>='0'&&ch[i]<='9'){

                System.out.println("Last Digit : "+ch[i]);
                break;
            }
        }
    }

    // Q37
    public static void printLastUppercase() {

        for(int i=ch.length-1;i>=0;i--){

            if(ch[i]>='A'&&ch[i]<='Z'){

                System.out.println("Last Uppercase : "+ch[i]);
                break;
            }
        }
    }

    // Q38
    public static void printLastLowercase() {

        for(int i=ch.length-1;i>=0;i--){

            if(ch[i]>='a'&&ch[i]<='z'){

                System.out.println("Last Lowercase : "+ch[i]);
                break;
            }
        }
    }

    // Q39
    public static void printLastSpecialCharacter() {

        for(int i=ch.length-1;i>=0;i--){

            char c=ch[i];

            if(!((c>='A'&&c<='Z')||
                 (c>='a'&&c<='z')||
                 (c>='0'&&c<='9'))){

                System.out.println("Last Special Character : "+c);
                break;
            }
        }
    }

    // Q40
    public static void printDivisibleBy3Or4() {

        System.out.print("Numbers divisible by 3 or 4 : ");

        for(int i=0;i<arr.length;i++){

            if(arr[i]%3==0 || arr[i]%4==0){

                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
    }
    
}
