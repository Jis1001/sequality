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

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        printResult(12,10);
        printResult(13,9);  
    }

    public static void printResult(int age, int size) {
        Calculate calc = new Calculate();
        int individual = calc.getIndividualFee(age);
        int total = calc.getTotalFee(age, size);

        if (size >= 10) {
            System.out.println("Age" + age + ",Size" + size + ":Individual" + individual + ",Total" + total + "(Discount applied)");
        } else {
            System.out.println("Age" + age + ",Size" + size + ":Individual" + individual + ",Total" + total);
        }
    }
}
