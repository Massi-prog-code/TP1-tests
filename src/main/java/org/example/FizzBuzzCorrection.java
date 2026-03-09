package org.example;

package org.example;

public class FizzBuzzCorrection {
    public static String fizzBuzz(int n) {

        if (n < 1) {  // CORRIGÉ : < au lieu de <=
            throw new IllegalArgumentException("n must be positive");
        }
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}