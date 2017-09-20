package com.mutation.testing.demo;

/**
 * This example class contains a simple method where all branches are tested.
 */
class FullMutationCoverage {
    String isIntegerGreaterThanOrLessThanZero(int input) {
        if (input > 0) {
            return "Greater than zero";
        } else if (input < 0) {
            return "Less than zero";
        } else {
            return "Zero";
        }
    }
}
