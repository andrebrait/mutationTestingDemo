package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.CakeType;

/**
 * This class is excluded from the mutation analysis so it will not appear in the results.
 */
public class ExcludedFromAnalysis {

    boolean isChocolate(CakeType cakeType) {
        return CakeType.CHOCOLATE.equals(cakeType);
    }
}
