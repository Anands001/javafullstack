package assignment2;

import java.util.*;

public class WAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicates in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
