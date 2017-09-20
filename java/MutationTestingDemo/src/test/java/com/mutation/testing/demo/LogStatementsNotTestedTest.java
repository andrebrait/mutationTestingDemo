package com.mutation.testing.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogStatementsNotTestedTest {

    private LogStatementsNotTested testee;

    @Before
    public void setUp() {
        testee = new LogStatementsNotTested();
    }

    @Test
    public void oneReturnsI() {
        assertEquals("I", testee.convertToRomanNumerals(1));
    }

    @Test
    public void twoReturnsII() {
        assertEquals("II", testee.convertToRomanNumerals(2));
    }

    @Test
    public void threeReturnsIII() {
        assertEquals("III", testee.convertToRomanNumerals(3));
    }

    @Test
    public void fourReturnsIV() {
        assertEquals("IV", testee.convertToRomanNumerals(4));
    }

    @Test
    public void fiveReturnsV() {
        assertEquals("V", testee.convertToRomanNumerals(5));
    }

    @Test
    public void sixReturnsVI() {
        assertEquals("VI", testee.convertToRomanNumerals(6));
    }

    @Test
    public void sevenReturnsVII() {
        assertEquals("VII", testee.convertToRomanNumerals(7));
    }

    @Test
    public void eightReturnsVII() {
        assertEquals("VIII", testee.convertToRomanNumerals(8));
    }

    @Test
    public void nineReturnsIX() {
        assertEquals("IX", testee.convertToRomanNumerals(9));
    }

    @Test
    public void tenReturnsX() {
        assertEquals("X", testee.convertToRomanNumerals(10));
    }

    @Test
    public void fourtyReturnsXL() {
        assertEquals("XL", testee.convertToRomanNumerals(40));
    }

    @Test
    public void fiftyReturnsL() {
        assertEquals("L", testee.convertToRomanNumerals(50));
    }

    @Test
    public void ninetyReturnsXC() {
        assertEquals("XC", testee.convertToRomanNumerals(90));
    }

    @Test
    public void oneHundredReturnsC() {
        assertEquals("C", testee.convertToRomanNumerals(100));
    }

    @Test
    public void fourHundredReturnsCD() {
        assertEquals("CD", testee.convertToRomanNumerals(400));
    }

    @Test
    public void fiveHundredReturnsD() {
        assertEquals("D", testee.convertToRomanNumerals(500));
    }

    @Test
    public void nineHundredReturnsCM() {
        assertEquals("CM", testee.convertToRomanNumerals(900));
    }

    @Test
    public void oneThousandReturnsM() {
        assertEquals("M", testee.convertToRomanNumerals(1000));
    }

    @Test
    public void oneThousandNineHundredAndFifyFourReturnsMCMLIV() {
        assertEquals("MCMLIV", testee.convertToRomanNumerals(1954));
    }

    @Test
    public void zeroReturnsNulla() {
        assertEquals("nulla", testee.convertToRomanNumerals(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void negativeThrowsException() {
        testee.convertToRomanNumerals(-1);
    }
}