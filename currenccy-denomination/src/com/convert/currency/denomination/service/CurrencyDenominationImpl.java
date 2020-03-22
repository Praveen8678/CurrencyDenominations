package com.convert.currency.denomination.service;

import java.util.Iterator;
import java.util.Map;

public class CurrencyDenominationImpl {
    public static String populateCurrencyDenomination(Map<String,Integer> map, int amount){
        StringBuffer result = new StringBuffer();
        Iterator<String> it = map.keySet().iterator();
        String denomination = "";
        int value = 0;
        while (it.hasNext()){
            int noOfCoins = 0;
            denomination = (String) it.next();
            value = map.get(denomination);
            if(amount >= value) {
                noOfCoins = amount / value;
                amount = amount % value;
            }
            if(noOfCoins != 0)
                result.append(noOfCoins).append(" ").append(denomination).append(", ");
        }
        return result.substring(0,result.length()-2).toString();
    }
}
