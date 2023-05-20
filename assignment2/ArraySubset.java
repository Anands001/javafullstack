package assignment2;

import java.util.Arrays;

public class ArraySubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }

        return j == arr2.length;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 9, 2};

        boolean isSubset = isSubset(array1, array2);
        System.out.println("Array2 is a subset of Array1: " + isSubset);
    }
}
