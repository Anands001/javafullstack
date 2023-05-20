package assignment2;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int[] temp = new int[n];
        sort(arr, temp, 0, n - 1);
    }

    private static void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 6, 7, 9};
        System.out.println("Original array: ");
        printArray(array);

        mergeSort(array);

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
