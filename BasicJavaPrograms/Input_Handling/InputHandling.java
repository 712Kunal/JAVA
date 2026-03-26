
import java.util.Scanner;

class InputHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t------------- SPACE SEPERATED ARRAY INPUT -------------");

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("\nEnter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe resultant array is ->");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        System.out.println();
        System.out.println();

        System.out.println("\t\t------------- IN STRING FORMAT -------------");
        sc.nextLine();
        System.out.println("\nEnter the array string seperated by spaces:");
        String str = sc.nextLine();

        String[] input = str.split(" ");
        int[] arr1 = new int[input.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(input[i].trim());
        }

        System.out.println("\nThe resultant array is ->");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("]");

        System.out.println();
        System.out.println();
        System.out.println("\t\t------------- COMMA SEPERATED INPUT -------------");

        System.out.println("\nEnter the array string seperated by commas:");
        str = sc.nextLine();
        input = str.split(",");
        int arr2[] = new int[input.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(input[i].trim());
        }

        System.out.println("\nThe resultant array is ->");
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("]\n");
    }
}
