import org.junit.jupiter.api.Test;
import org.example.tp1.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2,3));
    }
    @Test
    void testSubstract() {
        assertEquals(2, calculator.subtract(3,1));
    }

    @Test
    void testMultiply() {
        assertEquals(9, calculator.multiply(3,3));
    }


    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(4,2));
    }
    @Test
    void testDivideByzero(){
        assertThrows(ArithmeticException.class,()->{
            calculator.divide(4,0);
        });
    }
}