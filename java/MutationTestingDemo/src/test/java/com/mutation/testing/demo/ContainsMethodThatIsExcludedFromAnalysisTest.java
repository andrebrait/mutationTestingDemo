package com.mutation.testing.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsMethodThatIsExcludedFromAnalysisTest {

    private ContainsMethodThatIsExcludedFromAnalysis testee;

    @Before
    public void setUp() {
        testee = new ContainsMethodThatIsExcludedFromAnalysis();
    }

    @Test
    public void evenNumberReturnsTrue() {
        assertTrue(testee.isEven(4));
    }

    @Test
    public void oddNumberReturnsTrue() {
        assertFalse(testee.isEven(7));
    }

}