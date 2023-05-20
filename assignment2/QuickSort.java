package assignment2;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = part(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }

    private static int part(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        int[] array = {5, 2, 9, 1, 3, 7, 6};
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
        disp(array);

        quickSort(array);

        System.out.println("Sorted array: ");
        disp(array);
    }

    private static void disp(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
