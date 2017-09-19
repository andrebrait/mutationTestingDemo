package com.mutation.testing.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitPlatform.class)
class FullMutationCoverageTest {

    private FullMutationCoverage testee;

    @BeforeEach
    void setUp() {
        testee =  new FullMutationCoverage();
    }

    @Test
    void greaterThanZero() {
        assertEquals("Greater than zero", testee.isIntegerGreaterThanOrLessThanZero(1));
    }

    @Test
    void lessThanZero() {
        assertEquals("Less than zero", testee.isIntegerGreaterThanOrLessThanZero(-1));
    }

    @Test
    void zero() {
        assertEquals("Zero", testee.isIntegerGreaterThanOrLessThanZero(0));
    }
}