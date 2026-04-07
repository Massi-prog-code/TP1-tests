package org.example;
import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    private static final double EPSILON = 1e-10;

    @Test
    public void testAIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 3);
        });
    }

    @Test
    public void testNoRealRoots() {
        // x^2 + 1 = 0 -> delta = -4 < 0
        double[] result = QuadraticEquation.solve(1, 0, 1);
        assertNull(result);
    }

    @Test
    public void testOneDoubleRoot() {
        // x^2 - 2x + 1 = 0 -> (x-1)^2 = 0 -> root = 1
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1.0, result[0], EPSILON);
    }

    @Test
    public void testTwoRealRoots() {
        // x^2 - 5x + 6 = 0 -> roots: 2 and 3
        double[] result = QuadraticEquation.solve(1, -5, 6);
        assertNotNull(result);
        assertEquals(2, result.length);

        // Sort roots for comparison (implementation returns larger first)
        double root1 = Math.min(result[0], result[1]);
        double root2 = Math.max(result[0], result[1]);

        assertEquals(2.0, root1, EPSILON);
        assertEquals(3.0, root2, EPSILON);
    }
}