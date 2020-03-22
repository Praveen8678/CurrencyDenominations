package com.convert.currency.denomination.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndianCurrencyDenomination {

    private Map<String, Integer> map = new LinkedHashMap<>();

    public Map<String,Integer> getCoinList(){

        map.put("RUPEE",100);
        map.put("HALF-RUPEE",50);
        map.put("QUARTER-RUPEE",25);
        map.put("TWENTY-PAISE", 20);
        map.put("TEN-PAISE",10);
        map.put("FIVE-PAISE",5);
        map.put("PAISE", 1);

        return map;
    }
}
