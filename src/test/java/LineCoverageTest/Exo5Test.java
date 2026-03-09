package  org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testValueTooLow() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);
        });
    }

    @Test
    public void testValueTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000);
        });
    }

    @Test
    public void testSingleSymbols() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("V", RomanNumeral.toRoman(5));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("L", RomanNumeral.toRoman(50));
        assertEquals("C", RomanNumeral.toRoman(100));
        assertEquals("D", RomanNumeral.toRoman(500));
        assertEquals("M", RomanNumeral.toRoman(1000));
    }

    @Test
    public void testRepeatedSymbols() {
        assertEquals("II", RomanNumeral.toRoman(2));
        assertEquals("III", RomanNumeral.toRoman(3));
        assertEquals("XX", RomanNumeral.toRoman(20));
        assertEquals("XXX", RomanNumeral.toRoman(30));
        assertEquals("CC", RomanNumeral.toRoman(200));
        assertEquals("CCC", RomanNumeral.toRoman(300));
        assertEquals("MM", RomanNumeral.toRoman(2000));
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }

    @Test
    public void testSubtractiveNotation() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    @Test
    public void testComplexNumbers() {
        assertEquals("XLV", RomanNumeral.toRoman(45));
        assertEquals("XCIX", RomanNumeral.toRoman(99));
        assertEquals("CDXLIV", RomanNumeral.toRoman(444));
        assertEquals("CMXCIX", RomanNumeral.toRoman(999));
        assertEquals("MCMXLVIII", RomanNumeral.toRoman(1948));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}