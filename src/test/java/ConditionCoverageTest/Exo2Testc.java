package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Testc {

    // Condition 1: s1 == null (true), s2 == null (false)
    @Test
    public void testS1NullS2NotNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "test");
        });
    }

    // Condition 1: s1 == null (false), s2 == null (true)
    @Test
    public void testS1NotNullS2Null() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("test", null);
        });
    }

    // Condition 1: both true
    @Test
    public void testBothNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, null);
        });
    }

    // Condition 1: both false (no exception)
    @Test
    public void testBothNotNull() {
        // We'll just verify no exception is thrown
        assertDoesNotThrow(() -> {
            Anagram.isAnagram("test", "test");
        });
    }

    // Condition 2: s1.length() != s2.length() (true)
    @Test
    public void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    // Condition 2: s1.length() != s2.length() (false)
    // Then need to test the final condition (c != 0)
    @Test
    public void testSameLengthNotAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }

    // Test final condition (c != 0) false branch - all counts zero
    @Test
    public void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Test with special cases (spaces, uppercase)
    @Test
    public void testAnagramWithSpaces() {
        assertTrue(Anagram.isAnagram("conversation", "voices rant on"));
    }
}