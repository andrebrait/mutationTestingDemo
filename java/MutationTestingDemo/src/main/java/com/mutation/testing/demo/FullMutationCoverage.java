package com.mutation.testing.demo;

/**
 * Hello world!
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
