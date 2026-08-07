package arrayAssignment;

public class Assignment1 {

	    public static void main(String[] args) {

	        int[] a = {10, 20, 30, 40, 50,7,14,35,-10,-20,-30};

	        sumAll(a);
	        average(a);
	        sumEven(a);
	        sumOdd(a);
	        sumFirst3(a);
	        sumLast3(a);
	        sumPositive(a);
	        sumNegative(a);
	        sumEvenIndex(a);
	        sumOddIndex(a);
	        avgEven(a);
	        avgOdd(a);
	        middleElement(a);
	        productAll(a);
	        productEven(a);
	        productOdd(a);
	        reverse(a);
	        printEven(a);
	        printOdd(a);
	        printPositive(a);
	        printNegative(a);
	        printBuzz(a);
	        printNonZero(a);
	        divisibleBy3(a);
	        divisibleBy4(a);
	        sumDivisibleBy3(a);
	        sumDivisibleBy4(a);
	        productDivisibleBy3(a);
	        productDivisibleBy4(a);
	        singleDigit(a);
	        twoDigit(a);
	        threeDigit(a);
	        countEven(a);
	        countOdd(a);
	    }

	    // 1
	    static void sumAll(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            sum += n;
	        System.out.println("Sum = " + sum);
	    }

	    // 2
	    static void average(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            sum += n;
	        System.out.println("Average = " + (double) sum / a.length);
	    }

	    // 3
	    static void sumEven(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n % 2 == 0)
	                sum += n;
	        System.out.println("Sum of Even = " + sum);
	    }

	    // 4
	    static void sumOdd(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n % 2 != 0)
	                sum += n;
	        System.out.println("Sum of Odd = " + sum);
	    }

	    // 5
	    static void sumFirst3(int[] a) {
	        int sum = 0;
	        for (int i = 0; i < 3; i++)
	            sum += a[i];
	        System.out.println("First 3 Sum = " + sum);
	    }

	    // 6
	    static void sumLast3(int[] a) {
	        int sum = 0;
	        for (int i = a.length - 3; i < a.length; i++)
	            sum += a[i];
	        System.out.println("Last 3 Sum = " + sum);
	    }

	    // 7
	    static void sumPositive(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n > 0)
	                sum += n;
	        System.out.println("Positive Sum = " + sum);
	    }

	    // 8
	    static void sumNegative(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n < 0)
	                sum += n;
	        System.out.println("Negative Sum = " + sum);
	    }

	    // 9
	    static void sumEvenIndex(int[] a) {
	        int sum = 0;
	        for (int i = 0; i < a.length; i += 2)
	            sum += a[i];
	        System.out.println("Even Index Sum = " + sum);
	    }

	    // 10
	    static void sumOddIndex(int[] a) {
	        int sum = 0;
	        for (int i = 1; i < a.length; i += 2)
	            sum += a[i];
	        System.out.println("Odd Index Sum = " + sum);
	    }

	 // 11. Average of Even Elements
	    static void avgEven(int[] a) {
	        int sum = 0, count = 0;
	        for (int n : a) {
	            if (n % 2 == 0) {
	                sum += n;
	                count++;
	            }
	        }
	        if (count > 0)
	            System.out.println("Average of Even Elements = " + (double) sum / count);
	        else
	            System.out.println("No Even Elements");
	    }

	    // 12. Average of Odd Elements
	    static void avgOdd(int[] a) {
	        int sum = 0, count = 0;
	        for (int n : a) {
	            if (n % 2 != 0) {
	                sum += n;
	                count++;
	            }
	        }
	        if (count > 0)
	            System.out.println("Average of Odd Elements = " + (double) sum / count);
	        else
	            System.out.println("No Odd Elements");
	    }

	    // 13. Check Middle Element
	    static void checkMiddle(int[] a) {
	        if (a.length % 2 != 0)
	            System.out.println("Middle Element = " + a[a.length / 2]);
	        else
	            System.out.println("No Middle Element");
	    }

	    // 14. Print Middle Element
	    static void middleElement(int[] a) {
	        if (a.length % 2 != 0)
	            System.out.println("Middle Element = " + a[a.length / 2]);
	        else
	            System.out.println("No Middle Element");
	    }

	    // 15. Product of All Elements
	    static void productAll(int[] a) {
	        long product = 1;
	        for (int n : a)
	            product *= n;
	        System.out.println("Product of All Elements = " + product);
	    }

	    // 16. Product of Even Elements
	    static void productEven(int[] a) {
	        long product = 1;
	        for (int n : a)
	            if (n % 2 == 0)
	                product *= n;
	        System.out.println("Product of Even Elements = " + product);
	    }

	    // 17. Product of Odd Elements
	    static void productOdd(int[] a) {
	        long product = 1;
	        for (int n : a)
	            if (n % 2 != 0)
	                product *= n;
	        System.out.println("Product of Odd Elements = " + product);
	    }

	    // 18. Reverse Order
	    static void reverse(int[] a) {
	        System.out.print("Reverse Order: ");
	        for (int i = a.length - 1; i >= 0; i--)
	            System.out.print(a[i] + " ");
	        System.out.println();
	    }

	    // 19. Print Even Elements
	    static void printEven(int[] a) {
	        System.out.print("Even Elements: ");
	        for (int n : a)
	            if (n % 2 == 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 20. Print Odd Elements
	    static void printOdd(int[] a) {
	        System.out.print("Odd Elements: ");
	        for (int n : a)
	            if (n % 2 != 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 21. Print Positive Elements
	    static void printPositive(int[] a) {
	        System.out.print("Positive Elements: ");
	        for (int n : a)
	            if (n > 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 22. Print Negative Elements
	    static void printNegative(int[] a) {
	        System.out.print("Negative Elements: ");
	        for (int n : a)
	            if (n < 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 23. Print Buzz Numbers
	    static void printBuzz(int[] a) {
	        System.out.print("Buzz Numbers: ");
	        for (int n : a)
	            if (n % 7 == 0 || Math.abs(n) % 10 == 7)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 24. Print Non-Zero Numbers
	    static void printNonZero(int[] a) {
	        System.out.print("Non-Zero Numbers: ");
	        for (int n : a)
	            if (n != 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 25. Print Elements Divisible by 3
	    static void divisibleBy3(int[] a) {
	        System.out.print("Divisible by 3: ");
	        for (int n : a)
	            if (n % 3 == 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 26. Print Elements Divisible by 4
	    static void divisibleBy4(int[] a) {
	        System.out.print("Divisible by 4: ");
	        for (int n : a)
	            if (n % 4 == 0)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 27. Sum of Elements Divisible by 3
	    static void sumDivisibleBy3(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n % 3 == 0)
	                sum += n;
	        System.out.println("Sum Divisible by 3 = " + sum);
	    }

	    // 28. Sum of Elements Divisible by 4
	    static void sumDivisibleBy4(int[] a) {
	        int sum = 0;
	        for (int n : a)
	            if (n % 4 == 0)
	                sum += n;
	        System.out.println("Sum Divisible by 4 = " + sum);
	    }

	    // 29. Product of Elements Divisible by 3
	    static void productDivisibleBy3(int[] a) {
	        long product = 1;
	        for (int n : a)
	            if (n % 3 == 0)
	                product *= n;
	        System.out.println("Product Divisible by 3 = " + product);
	    }

	    // 30. Product of Elements Divisible by 4
	    static void productDivisibleBy4(int[] a) {
	        long product = 1;
	        for (int n : a)
	            if (n % 4 == 0)
	                product *= n;
	        System.out.println("Product Divisible by 4 = " + product);
	    }

	    // 31. Print Single Digit Numbers
	    static void singleDigit(int[] a) {
	        System.out.print("Single Digit Numbers: ");
	        for (int n : a)
	            if (Math.abs(n) <= 9)
	                System.out.print(n + " ");
	        System.out.println();
	    }

	    // 32. Print Two Digit Numbers
	    static void twoDigit(int[] a) {
	        System.out.print("Two Digit Numbers: ");
	        for (int n : a) {
	            int x = Math.abs(n);
	            if (x >= 10 && x <= 99)
	                System.out.print(n + " ");
	        }
	        System.out.println();
	    }

	    // 33. Print Three Digit Numbers
	    static void threeDigit(int[] a) {
	        System.out.print("Three Digit Numbers: ");
	        for (int n : a) {
	            int x = Math.abs(n);
	            if (x >= 100 && x <= 999)
	                System.out.print(n + " ");
	        }
	        System.out.println();
	    }

	    // 34. Count Even Elements
	    static void countEven(int[] a) {
	        int count = 0;
	        for (int n : a)
	            if (n % 2 == 0)
	                count++;
	        System.out.println("Even Elements Count = " + count);
	    }

	    // 35. Count Odd Elements
	    static void countOdd(int[] a) {
	        int count = 0;
	        for (int n : a)
	            if (n % 2 != 0)
	                count++;
	        System.out.println("Odd Elements Count = " + count);
	    }
	
}
