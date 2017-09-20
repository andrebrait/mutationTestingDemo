package com.mutation.testing.demo;

import java.util.Collection;
import java.util.Optional;

/**
 * When "lowest.compareTo(i) > 0" is mutated to "lowest.compareTo(i) >= 0" the same value will still be returned so the
 * code will still behave in the same way meaning the mutation cannot get killed by any tests.
 */
class GeneratesEquivalentMutation {

    Optional<Integer> getLowestValue(Collection<Integer> input) {
        Integer lowest = null;
        for(Integer i: input) {
            if (lowest == null || lowest.compareTo(i) > 0) {
                lowest = i;
            }
        }
        return Optional.ofNullable(lowest);
    }
}
