package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.Cake;
import com.mutation.testing.demo.cake.CakeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UntestableSwitchDefaultTest {
    private UntestableSwitchDefault testee;

    @Before
    public void setUp() {
        testee = new UntestableSwitchDefault();
    }

    @Test
    public void canCreateVictoriaSponge() {
        Cake actual = testee.createCake(CakeType.VICTORIA_SPONGE);
        assertIngredients(actual, 100, 0, 0);
    }

    @Test
    public void canCreateChocolateCake() {
        Cake actual = testee.createCake(CakeType.CHOCOLATE);
        assertIngredients(actual, 75, 0, 25);
    }

    @Test
    public void canCreateOrangeCake() {
        Cake actual = testee.createCake(CakeType.ORANGE);
        assertIngredients(actual, 100, 15, 0);
    }

    private void assertIngredients(Cake actual, int flour, int orangeJuice, int cocoa) {
        assertEquals(100, actual.getMargarine());
        assertEquals(flour, actual.getFlour());
        assertEquals(100, actual.getSugar());
        assertEquals(2, actual.getEggs());
        assertEquals(orangeJuice, actual.getOrangeJuice());
        assertEquals(cocoa, actual.getCocoa());
    }

}