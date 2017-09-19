package com.mutation.testing.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullMutationCoverageTest {

    private FullMutationCoverage testee;

    @BeforeEach
    public void setUp() {
        testee =  new FullMutationCoverage();
    }

    @Test
    public void failing() {
        assertEquals("Hello World!", testee.convertToRomanNumberals(1));
    }
}