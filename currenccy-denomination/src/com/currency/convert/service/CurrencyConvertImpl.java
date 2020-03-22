package com.currency.convert.service;

import java.util.Iterator;
import java.util.Map;

public class CurrencyConvertImpl {

    public static String getCurrencyDenomination(Map<String, Integer> map, int amount){
        StringBuffer result = new StringBuffer();
        String currName = "";
        int currCount,coinCount = 0;
        Iterator<String> currDenom = map.keySet().iterator();
        while (currDenom.hasNext()){
            coinCount = 0;
            currName = currDenom.next();
            currCount = (Integer) map.get(currName);
            if(amount >= currCount) {
                coinCount = amount / currCount;
                amount = amount % currCount;
            }
            if(coinCount != 0)
                result.append(coinCount).append(" ").append(currName+", ");
        }
        return result.substring(0,result.length()-2).toString();
    }
}
