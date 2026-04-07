package org.example;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Testb {

    // Branch: array == null (true)
    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

    // Branch: array == null (false) - proceed with search

    // Branch: while loop condition (true) - enter loop
    // Branch: array[mid] == element (true) - return mid
    @Test
    public void testElementFoundInMiddle() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
    }

    // Branch: array[mid] == element (false) - go to else-if
    // Branch: array[mid] <= element (true) - go to low = mid + 1
    @Test
    public void testElementGreaterThanMid() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(5, BinarySearch.binarySearch(array, 6)); // Should find at index 5
    }

    // Branch: array[mid] == element (false) - go to else-if
    // Branch: array[mid] <= element (false) - go to else (high = mid - 1)
    @Test
    public void testElementLessThanMid() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(1, BinarySearch.binarySearch(array, 2)); // Should find at index 1
    }

    // Branch: while loop condition (false) - exit without finding
    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 6));
    }

    // Edge case: element at first position
    @Test
    public void testElementAtFirstPosition() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    // Edge case: element at last position
    @Test
    public void testElementAtLastPosition() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(array, 5));
    }
}