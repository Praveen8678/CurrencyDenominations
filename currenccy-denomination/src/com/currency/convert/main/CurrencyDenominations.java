package com.currency.convert.main;

import com.currency.convert.bean.Currency;
import com.currency.convert.bean.IndianCurrency;
import com.currency.convert.bean.UsCurrency;
import com.currency.convert.service.CurrencyConvertImpl;

public class CurrencyDenominations {
    public static void main(String[] args) {
        final int AMOUNT = 287;
        System.out.println(CurrencyConvertImpl.getCurrencyDenomination(new UsCurrency().getCurrencyList(),AMOUNT));
        //System.out.println(CurrencyConvertImpl.getCurrencyDenomination(new IndianCurrency().getCurrencyList(),AMOUNT));
    }
}
