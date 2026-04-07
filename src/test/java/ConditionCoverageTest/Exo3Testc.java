package org.example;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Testc {

    // Condition: array == null (true)
    @Test
    public void testArrayNull() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

    // Condition: array == null (false)
    @Test
    public void testArrayNotNull() {
        int[] array = {1, 2, 3};
        assertDoesNotThrow(() -> {
            BinarySearch.binarySearch(array, 2);
        });
    }

    // Test all combinations of comparisons

    // Case 1: array[mid] == element (true)
    @Test
    public void testExactMatchAtMid() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
    }

    // Case 2: array[mid] == element (false) AND array[mid] <= element (true)
    // This means array[mid] < element
    @Test
    public void testMidLessThanElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // First mid will be at index 4 (value 5), element 8 > 5
        assertEquals(7, BinarySearch.binarySearch(array, 8));
    }

    // Case 3: array[mid] == element (false) AND array[mid] <= element (false)
    // This means array[mid] > element
    @Test
    public void testMidGreaterThanElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // First mid will be at index 4 (value 5), element 2 < 5
        assertEquals(1, BinarySearch.binarySearch(array, 2));
    }

    // Edge case: single element array
    @Test
    public void testSingleElementFound() {
        int[] array = {7};
        assertEquals(0, BinarySearch.binarySearch(array, 7));
    }

    @Test
    public void testSingleElementNotFound() {
        int[] array = {7};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }

    // Test with duplicate values (though binary search typically assumes sorted unique)
    @Test
    public void testWithDuplicates() {
        int[] array = {1, 2, 2, 2, 3, 4};
        // Should find any occurrence of 2
        int result = BinarySearch.binarySearch(array, 2);
        assertTrue(result >= 1 && result <= 3);
    }

    // Test with negative numbers
    @Test
    public void testWithNegativeNumbers() {
        int[] array = {-10, -5, -2, 0, 3, 7};
        assertEquals(1, BinarySearch.binarySearch(array, -5));
        assertEquals(-1, BinarySearch.binarySearch(array, -1));
    }
}