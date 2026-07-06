package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculator = new Calculate();
        int expected = 5;
        assertEquals(expected, calculator.sum(2, 3));
    }
}
