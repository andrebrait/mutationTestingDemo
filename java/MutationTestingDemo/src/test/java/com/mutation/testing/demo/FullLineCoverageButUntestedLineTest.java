package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.Cake;
import com.mutation.testing.demo.cake.CakeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullLineCoverageButUntestedLineTest {
    private FullLineCoverageButUntestedLine testee;

    @Before
    public void setUp() {
        testee = new FullLineCoverageButUntestedLine();
    }

    @Test
    public void canCreateVictoriaSponge() {
        Cake actual = testee.createCake(CakeType.VICTORIA_SPONGE);
        assertEquals(100, actual.getMargarine());
        assertEquals(100, actual.getFlour());
        assertEquals(100, actual.getSugar());
        assertEquals(2, actual.getEggs());
        assertEquals(0, actual.getOrangeJuice());
    }

    @Test
    public void canCreateChocolateCake() {
        Cake actual = testee.createCake(CakeType.CHOCOLATE);
        assertEquals(100, actual.getMargarine());
        assertEquals(25, actual.getCocoa());
        assertEquals(100, actual.getSugar());
        assertEquals(2, actual.getEggs());
        assertEquals(0, actual.getOrangeJuice());
    }

    @Test
    public void canCreateOrangeCake() {
        Cake actual = testee.createCake(CakeType.ORANGE);
        assertEquals(100, actual.getMargarine());
        assertEquals(100, actual.getFlour());
        assertEquals(100, actual.getSugar());
        assertEquals(2, actual.getEggs());
        assertEquals(15, actual.getOrangeJuice());
    }

}