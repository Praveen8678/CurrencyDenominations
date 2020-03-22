package com.currency.convert.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndianCurrency implements Currency {
    @Override
    public Map<String, Integer> getCurrencyList() {
        Map<String, Integer> map = new LinkedHashMap<>();

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
