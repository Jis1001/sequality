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

    @Test
    public void testGetIndividualFeeChild() {
        Calculate calculator = new Calculate();
        assertEquals(1000, calculator.getIndividualFee(12));
    }
    
    @Test
    public void testGetIndividualFeeAdult() {
        Calculate calculator = new Calculate();
        assertEquals(2000, calculator.getIndividualFee(13));
    }

    @Test
    public void testGetTotalFeeNoDiscount() {
        Calculate calculator = new Calculate();
        assertEquals(18000, calculator.getTotalFee(13, 9));
    }
    
    @Test
    public void testGetTotalFeeDiscount() {
        Calculate calculator = new Calculate();
        assertEquals(9000, calculator.getTotalFee(12, 10));
    }
}
