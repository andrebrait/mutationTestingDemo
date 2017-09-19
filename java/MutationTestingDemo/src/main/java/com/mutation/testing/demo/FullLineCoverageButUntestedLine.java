package com.mutation.testing.demo;

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

    class Cake {
        private int margarine;
        private int flour;
        private int cocoa;
        private int eggs;
        private int orangeJuice;
        private int sugar;

        void setMargarine(int margerine) {
            this.margarine = margerine;
        }

        int getMargarine() {
            return margarine;
        }

        void setFlour(int flour) {
            this.flour = flour;
        }

        int getFlour() {
            return flour;
        }

        void setCocoa(int cocoa) {
            this.cocoa = cocoa;
        }

        int getCocoa() {
            return cocoa;
        }

        void setEggs(int eggs) {
            this.eggs = eggs;
        }

        int getEggs() {
            return eggs;
        }

        void setOrangeJuice(int orangeJuice) {
            this.orangeJuice = orangeJuice;
        }

        int getOrangeJuice() {
            return orangeJuice;
        }

        void setSugar(int sugar) {
            this.sugar = sugar;
        }

        int getSugar() {
            return sugar;
        }
    }

    protected enum CakeType {
        VICTORIA_SPONGE,
        CHOCOLATE,
        ORANGE
    }
}
