package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.CakeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsRedundantCodeTest {

    private ContainsRedundantCode testee;

    @Before
    public void setUp() {
        testee = new ContainsRedundantCode();
    }

    @Test
    public void incrementsOrderCount() {
        assertEquals("CHOCOLATE order received. This has been ordered 0 times before.", testee.orderCake(CakeType.CHOCOLATE));
        assertEquals("CHOCOLATE order received. This has been ordered 1 times before.", testee.orderCake(CakeType.CHOCOLATE));
        assertEquals("ORANGE order received. This has been ordered 0 times before.", testee.orderCake(CakeType.ORANGE));
        assertEquals("CHOCOLATE order received. This has been ordered 2 times before.", testee.orderCake(CakeType.CHOCOLATE));
    }
}