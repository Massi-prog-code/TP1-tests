package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Testb {

    // Branch: n <= 1 (true)
    @Test
    public void testNLessThanOrEqualToOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(1);  //  This should NOT throw exception
        });
    }

    // Branch: n <= 1 (false) - continue

    // Branch: n % 15 == 0 (true)
    @Test
    public void testDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    // Branch: n % 15 == 0 (false) - go to next condition

    // Branch: n % 3 == 0 (true)
    @Test
    public void testDivisibleBy3Only() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    // Branch: n % 3 == 0 (false) - go to next condition

    // Branch: n % 5 == 0 (true)
    @Test
    public void testDivisibleBy5Only() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
    }

    // Branch: n % 5 == 0 (false) - go to default return
    @Test
    public void testNotDivisibleBy3Or5() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}