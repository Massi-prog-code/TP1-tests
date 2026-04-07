package org.example;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Testc {

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    public void testOddLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("aba"));
    }

    @Test
    public void testNonPalindromeStartDiffers() {
        assertFalse(Palindrome.isPalindrome("abca"));
    }

    @Test
    public void testNonPalindromeMiddleDiffers() {
        assertFalse(Palindrome.isPalindrome("abxb"));
    }

    @Test
    public void testWithSpacesAndUppercase() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }
}