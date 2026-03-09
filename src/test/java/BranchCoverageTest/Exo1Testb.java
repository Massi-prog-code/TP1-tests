package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Testb {

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }

    @Test
    public void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("race car"));
    }
}