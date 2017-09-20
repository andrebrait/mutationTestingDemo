package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.CakeType;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains unnecessary code. Fetching the existing value and the null check are not required as compute if
 * absent will return the existing value if it is present anyway. This means that mutation in this redundant code will
 * not be killed as the behaviour will be unchanged.
 */
class ContainsRedundantCode {

    private Map<CakeType, Integer> orderMap = new HashMap<>();

    String orderCake(CakeType cakeType) {
        Integer orderCount = orderMap.get(cakeType);
        if (orderCount == null) {
            orderCount = orderMap.computeIfAbsent(cakeType, k -> 0);
        }
        orderMap.put(cakeType, orderCount + 1);
        return cakeType + " order received. This has been ordered " + orderCount + " times before.";
    }
}
