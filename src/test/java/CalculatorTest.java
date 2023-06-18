import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.add(10,5);
        assertEquals(expected, result, 0.001);
        double expected2 = 150;
        double result2 = calculator.add(100,50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.add(10,5);
        assertEquals(expected, result, 0.001);
        double expected2 = 150;
        double result2 = calculator.add(100,50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expected = 10;
        double result = calculator.divide(100,10);
        assertEquals(expected, result, 0.001);
        double expected2 = 3;
        double result2 = calculator.divide(9,3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void multiple() {
        Calculator calculator = new Calculator();
        double expected = 50;
        double result = calculator.multiple(5,10);
        assertEquals(expected, result, 0.001);
        double expected2 = 9;
        double result2 = calculator.multiple(3,3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void square() {
        Calculator calculator = new Calculator();
        double expected = 100;
        double result = calculator.square(10);
        assertEquals(expected, result, 0.001);
        double expected2 = 36;
        double result2 = calculator.square(6);
        assertEquals(expected2, result2, 0.001);
    }
}