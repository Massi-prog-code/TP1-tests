package org.example;

public class BinarySearchCorrection {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {  //  CORRECTED: use <= instead of <
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {  // CORRECTED: use < instead of <=
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}