package org.example;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Testc {

    // Test each condition independently

    // Condition: n <= 1 (true) for various values
    @Test
    public void testConditionNLessThanOrEqualToOne() {
        // n = 0 (true)
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });

        // n = 1 (true) -  This should be false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(1);
        });

        // n = -5 (true)
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(-5);
        });
    }

    // Condition: n <= 1 (false)
    @Test
    public void testConditionNGreaterThanOne() {
        assertDoesNotThrow(() -> {
            FizzBuzz.fizzBuzz(2);
        });
    }

    // Test all combinations of divisibility

    // Condition: divisible by 15 (true) - covers FizzBuzz
    @Test
    public void testDivisibleBy15True() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    // Condition: divisible by 15 (false) AND divisible by 3 (true) - covers Fizz
    @Test
    public void testDivisibleBy3TrueDivisibleBy15False() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(18));
    }

    // Condition: divisible by 15 (false) AND divisible by 3 (false) AND divisible by 5 (true) - covers Buzz
    @Test
    public void testDivisibleBy5TrueOthersFalse() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
    }

    // Condition: all divisibility conditions false - returns number as string
    @Test
    public void testNotDivisibleByAnything() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
        assertEquals("13", FizzBuzz.fizzBuzz(13));
        assertEquals("14", FizzBuzz.fizzBuzz(14));
    }

    // Edge case: large numbers
    @Test
    public void testLargeNumbers() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3000003));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5000000));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15000000));
        assertEquals("1234", FizzBuzz.fizzBuzz(1234));
    }
}