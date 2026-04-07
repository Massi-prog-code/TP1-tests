package org.example;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Testc {

    private static final double EPSILON = 1e-10;

    // Condition: a == 0 (true)
    @Test
    public void testAEqualsZeroTrue() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 1, 1);
        });
    }

    // Condition: a == 0 (false)
    @Test
    public void testAEqualsZeroFalse() {
        assertDoesNotThrow(() -> {
            QuadraticEquation.solve(1, 1, 1);
        });
    }

    // Condition: delta < 0 (true)
    @Test
    public void testDeltaNegativeTrue() {
        double[] result = QuadraticEquation.solve(2, 1, 2); // delta = 1 - 16 = -15
        assertNull(result);
    }

    // Condition: delta < 0 (false) AND delta == 0 (true)
    @Test
    public void testDeltaZeroTrue() {
        double[] result = QuadraticEquation.solve(4, -4, 1); // 4x^2 - 4x + 1 = 0 -> delta = 16 - 16 = 0
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(0.5, result[0], EPSILON);
    }

    // Condition: delta < 0 (false) AND delta == 0 (false)
    @Test
    public void testDeltaPositiveTrue() {
        double[] result = QuadraticEquation.solve(1, -7, 12); // x^2 - 7x + 12 = 0 -> roots: 3 and 4
        assertNotNull(result);
        assertEquals(2, result.length);

        double root1 = Math.min(result[0], result[1]);
        double root2 = Math.max(result[0], result[1]);

        assertEquals(3.0, root1, EPSILON);
        assertEquals(4.0, root2, EPSILON);
    }

    // Test with negative 'a'
    @Test
    public void testNegativeA() {
        // -x^2 + 5x - 6 = 0 -> roots: 2 and 3 (same as x^2 - 5x + 6 = 0)
        double[] result = QuadraticEquation.solve(-1, 5, -6);
        assertNotNull(result);
        assertEquals(2, result.length);

        double root1 = Math.min(result[0], result[1]);
        double root2 = Math.max(result[0], result[1]);

        assertEquals(2.0, root1, EPSILON);
        assertEquals(3.0, root2, EPSILON);
    }

    // Test with fractional roots
    @Test
    public void testFractionalRoots() {
        // 2x^2 - 5x + 2 = 0 -> roots: 0.5 and 2
        double[] result = QuadraticEquation.solve(2, -5, 2);
        assertNotNull(result);
        assertEquals(2, result.length);

        double root1 = Math.min(result[0], result[1]);
        double root2 = Math.max(result[0], result[1]);

        assertEquals(0.5, root1, EPSILON);
        assertEquals(2.0, root2, EPSILON);
    }
}