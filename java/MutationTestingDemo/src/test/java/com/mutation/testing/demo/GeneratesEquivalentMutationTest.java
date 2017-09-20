package com.mutation.testing.demo;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.*;

public class GeneratesEquivalentMutationTest {

    private GeneratesEquivalentMutation testee;

    @Before
    public void setUp() {
        testee = new GeneratesEquivalentMutation();
    }

    @Test
    public void findsLowestValue() {
        Optional<Integer> actual = testee.getLowestValue(Arrays.asList(6, 8, 4, 23, 7, 45));
        assertTrue(actual.isPresent());
        assertEquals(Integer.valueOf(4), actual.get());
    }

    @Test
    public void returnsEmptyOptionalIfEmptyCollection() {
        Optional<Integer> actual = testee.getLowestValue(Collections.emptySet());
        assertFalse(actual.isPresent());
    }

}