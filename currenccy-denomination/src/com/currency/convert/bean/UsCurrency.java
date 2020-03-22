package com.currency.convert.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsCurrency implements Currency {
    @Override
    public Map<String, Integer> getCurrencyList() {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("DOLLAR",100);
        map.put("QUARTER-RUPEE",25);
        map.put("DIME",10);
        map.put("NICKEL",5);
        map.put("PENNY", 1);

        return map;
    }
}
