package com.mutation.testing.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullMutationCoverageTest {

    private FullMutationCoverage testee;

    @Before
    public void setUp() {
        testee =  new FullMutationCoverage();
    }

    @Test
    public void greaterThanZero() {
        assertEquals("Greater than zero", testee.isIntegerGreaterThanOrLessThanZero(1));
    }

    @Test
    public void lessThanZero() {
        assertEquals("Less than zero", testee.isIntegerGreaterThanOrLessThanZero(-1));
    }

    @Test
    public void zero() {
        assertEquals("Zero", testee.isIntegerGreaterThanOrLessThanZero(0));
    }
}