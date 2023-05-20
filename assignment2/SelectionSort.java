package assignment2;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int mIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mIndex]) {
                    mIndex = j;
                }
            }
            swap(arr, i, mIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array: ");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
