package com.mutation.testing.demo;

import com.mutation.testing.demo.cake.CakeType;

import java.util.HashMap;
import java.util.Map;

public class ContainsRedundantCode {

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
