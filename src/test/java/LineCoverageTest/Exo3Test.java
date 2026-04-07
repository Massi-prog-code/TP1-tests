package org.example;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }

    @Test
    public void testSingleElementFound() {
        int[] array = {5};
        assertEquals(0, BinarySearch.binarySearch(array, 5));
    }
}