package com.convert.currency.denomination.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsCurrencyDenomination {

    private Map<String, Integer> map = new LinkedHashMap<>();

    public Map<String,Integer> getCoinList(){

        map.put("DOLLAR",100);
        map.put("QUARTER-RUPEE",25);
        map.put("DIME",10);
        map.put("NICKEL",5);
        map.put("PENNY", 1);

        return map;
    }
}
