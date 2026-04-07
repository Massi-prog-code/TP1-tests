package org.example;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Testb {

    // Branch: n < 1 (true)
    @Test
    public void testValueTooLow() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);
        });
    }

    // Branch: n > 3999 (true)
    @Test
    public void testValueTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000);
        });
    }

    // Branch: valid range - test different paths through the loops

    // Test case where while loop condition is true multiple times
    @Test
    public void testMultipleSameSymbol() {
        assertEquals("III", RomanNumeral.toRoman(3)); // while loop for I runs 3 times
    }

    // Test case where while loop condition is false for some symbols
    @Test
    public void testSkipSomeSymbols() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        // Should use "IV" (while loop for I should not run after using subtractive notation)
    }

    // Test combination of multiple symbols
    @Test
    public void testCombination() {
        assertEquals("MCMXLIV", RomanNumeral.toRoman(1944));
    }

    // Test boundary values
    @Test
    public void testMinValue() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    public void testMaxValue() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }

    // Test all subtractive cases
    @Test
    public void testAllSubtractiveCases() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
    }
}