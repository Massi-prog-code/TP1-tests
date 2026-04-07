package org.example;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Testc {

    // Test all combinations of the initial condition
    @Test
    public void testNLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);
        });
    }

    @Test
    public void testNGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000);
        });
    }

    @Test
    public void testNBetween1And3999() {
        assertDoesNotThrow(() -> {
            RomanNumeral.toRoman(100);
        });
    }

    // Test loop conditions - for each symbol, test while condition true/false

    // Test where while condition is true for first symbol
    @Test
    public void testWhileTrueForM() {
        assertEquals("MM", RomanNumeral.toRoman(2000)); // while true for M twice
    }

    // Test where while condition is false for some symbols, true for others
    @Test
    public void testMixedConditions() {
        assertEquals("CMXCVIII", RomanNumeral.toRoman(998));
        // Should trigger: CM (true for CM), XC (true for XC), VIII (true for V, I)
    }

    // Test all numbers that require each subtractive pair
    @Test
    public void testEachSubtractiveCase() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    // Test numbers with repeated symbols up to 3 times
    @Test
    public void testRepeatedSymbolsUpToThree() {
        assertEquals("III", RomanNumeral.toRoman(3));
        assertEquals("XXX", RomanNumeral.toRoman(30));
        assertEquals("CCC", RomanNumeral.toRoman(300));
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }

    // Test complex cases covering many conditions
    @Test
    public void testComplexCases() {
        assertEquals("MCMXLVIII", RomanNumeral.toRoman(1948));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
        assertEquals("CDXLIV", RomanNumeral.toRoman(444));
    }

    // Test case where after subtractive, we still need to add more
    @Test
    public void testSubtractiveThenAdditive() {
        assertEquals("XCIV", RomanNumeral.toRoman(94)); // XC (90) then IV (4)
        assertEquals("CDXC", RomanNumeral.toRoman(490)); // CD (400) then XC (90)
    }
}