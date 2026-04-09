package org.example;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testNullFirstString() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "test");
        });
    }

    @Test
    public void testNullSecondString() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("test", null);
        });
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("hello", "helloo"));
    }

    @Test
    public void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }
}