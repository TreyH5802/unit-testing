package com.csc205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //SEAT

        //setup
        int expected = 4;

        // exercise
        int actual = new Calculator().add(2, 2);

        // assertion
        assertEquals();
    }

    @Test
    void testAdd() {

        int expected = 6;
        int actual = new Calculator().add(2, 2, 2);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {

        int expected = 2;
        int actual = new Calculator().subtract(4, 2);

        assertEquals(expected, actual);
    }

    @Test
    void mutiply() {

        int expected = 4;
        int actual = new Calculator().multiply(2, 2);

        assertEquals(expected, actual);

    }

    @Test
    void divide() {

        int expected = 4;
        int actual = new Calculator().divide(8, 2);

        assertEquals(expected, actual);
    }

    @Test
    void divideByZero() {

        assertThrows(expectedtypeArithmeticException.class, executable:() ->{
            new CalculatorTest().divide(0, 0);
        });
    }
}
