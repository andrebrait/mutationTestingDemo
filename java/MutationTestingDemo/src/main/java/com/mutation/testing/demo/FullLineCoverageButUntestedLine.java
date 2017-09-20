package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.Cake;
import com.mutation.testing.demo.cake.CakeType;

/**
 * This example class contains a simple method where all lines of the method are executed by the tests but one line of
 * the functionality is not asserted upon.
 */
class FullLineCoverageButUntestedLine {

    private static final int MARGARINE_WEIGHT = 100;
    private static final int COCOA_WEIGHT = 25;
    private static final int EGG_COUNT = 2;
    private static final int ORANGE_JUICE_VOLUME = 15;

    Cake createCake(CakeType cakeType) {
        Cake cake = new Cake();
        cake.setMargarine(MARGARINE_WEIGHT);
        cake.setSugar(MARGARINE_WEIGHT);
        cake.setEggs(EGG_COUNT);
        if (CakeType.CHOCOLATE.equals(cakeType)) {
            cake.setFlour(MARGARINE_WEIGHT - COCOA_WEIGHT);
            cake.setCocoa(COCOA_WEIGHT);
        } else {
            cake.setFlour(MARGARINE_WEIGHT);
            if (CakeType.ORANGE.equals(cakeType)) {
                cake.setOrangeJuice(ORANGE_JUICE_VOLUME);
            }
        }
        return cake;
    }

}
