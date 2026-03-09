package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Testb {

    // Branch 1: Test first null condition (s1 == null)
    @Test
    public void testFirstStringNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "test");
        });
    }

    // Branch 1: Test second null condition (s2 == null)
    @Test
    public void testSecondStringNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("test", null);
        });
    }

    // Branch 1: Test both null
    @Test
    public void testBothStringsNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, null);
        });
    }

    // Branch 2: Different lengths (true branch of length check)
    @Test
    public void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    // Branch 2: Same lengths (false branch of length check)
    // Then test branches inside the character counting loop
    @Test
    public void testValidAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    // Test false branch of the final check (c != 0)
    @Test
    public void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "holla"));
    }

    // Test with spaces and uppercase to ensure preprocessing works
    @Test
    public void testAnagramWithSpacesAndUppercase() {
        assertTrue(Anagram.isAnagram("William Shakespeare", "I am a weakish speller"));
    }
}