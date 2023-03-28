package com.example.toshiba;

import junit.framework.TestCase;

//cover the methods with test case
public class CalculatorTest extends TestCase {

    //testing one case -- testcase
    public void testAdd() {
        int expected = 40;
        int actual = Calculator.add(10,20);

        assertEquals(expected,actual);
    }
}