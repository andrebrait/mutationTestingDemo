package com.mutation.testing.demo;

import java.util.Collection;
import java.util.Optional;

public class GeneratesEquivalentMutation {

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
