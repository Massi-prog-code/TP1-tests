package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Testb {

    private static final double EPSILON = 1e-10;

    // Branch: a == 0 (true)
    @Test
    public void testAZeroBranch() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 3);
        });
    }

    // Branch: a == 0 (false) - continue

    // Branch: delta < 0 (true)
    @Test
    public void testDeltaNegativeBranch() {
        // x^2 + x + 1 = 0 -> delta = -3 < 0
        double[] result = QuadraticEquation.solve(1, 1, 1);
        assertNull(result);
    }

    // Branch: delta < 0 (false) - check next condition

    // Branch: delta == 0 (true)
    @Test
    public void testDeltaZeroBranch() {
        // x^2 + 2x + 1 = 0 -> delta = 0
        double[] result = QuadraticEquation.solve(1, 2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(-1.0, result[0], EPSILON);
    }

    // Branch: delta == 0 (false) - two roots
    @Test
    public void testDeltaPositiveBranch() {
        // x^2 - 3x + 2 = 0 -> roots: 1 and 2
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);

        double root1 = Math.min(result[0], result[1]);
        double root2 = Math.max(result[0], result[1]);

        assertEquals(1.0, root1, EPSILON);
        assertEquals(2.0, root2, EPSILON);
    }

    // Edge case: very small delta (should be caught by == comparison)
    @Test
    public void testVerySmallDelta() {
        // This might cause precision issues
        double[] result = QuadraticEquation.solve(1, -2, 1 - 1e-15);
        assertNotNull(result);
        // The result should have 2 roots very close to 1
    }
}