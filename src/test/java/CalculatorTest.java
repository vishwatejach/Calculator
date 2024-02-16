import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testSquareRoot() {
        Main calculator = new Main();
        double result = calculator.squareRoot(16.0);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testFactorial() {
        Main calculator = new Main();
        long result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    void testNaturalLogarithm() {
        Main calculator = new Main();
        double result = calculator.naturalLogarithm(2.0);
        assertEquals(0.6931, result, 0.0001);
    }

    @Test
    void testPower() {
        Main calculator = new Main();
        double result = calculator.power(2.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }
}
