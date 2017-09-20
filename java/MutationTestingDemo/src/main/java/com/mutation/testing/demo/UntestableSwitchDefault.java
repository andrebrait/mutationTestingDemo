package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.Cake;
import com.mutation.testing.demo.cake.CakeType;

/**
 * This example class contains a simple switch statement with a default block which ensures the code fails fast if there
 * are new enum values added but at the moment that code is unreachable so any mutations there will not be killed.
 */
class UntestableSwitchDefault {

    private static final int MARGARINE_WEIGHT = 100;
    private static final int COCOA_WEIGHT = 25;
    private static final int EGG_COUNT = 2;
    private static final int ORANGE_JUICE_VOLUME = 15;

    Cake createCake(CakeType cakeType) {
        Cake cake = new Cake();
        cake.setMargarine(MARGARINE_WEIGHT);
        cake.setSugar(MARGARINE_WEIGHT);
        cake.setEggs(EGG_COUNT);
        switch (cakeType) {
            case CHOCOLATE:
                cake.setFlour(MARGARINE_WEIGHT - COCOA_WEIGHT);
                cake.setCocoa(COCOA_WEIGHT);
                break;
            case VICTORIA_SPONGE:
                cake.setFlour(MARGARINE_WEIGHT);
                break;
            case ORANGE:
                cake.setFlour(MARGARINE_WEIGHT);
                cake.setOrangeJuice(ORANGE_JUICE_VOLUME);
                break;
            default:
                throw new IllegalArgumentException("Unrecognised cake type: " + cakeType);

        }
        return cake;
    }
}
