package com.convert.currency.denomination.main;

import com.convert.currency.denomination.bean.UsCurrencyDenomination;
import com.convert.currency.denomination.service.CurrencyDenominationFactory;
import com.convert.currency.denomination.service.CurrencyDenominationImpl;

import java.util.Map;

public class CurrencyDenominationApp {
    public static final int AMOUNT = 286;
    public static void main(String[] args) {
        CurrencyDenominationFactory<UsCurrencyDenomination> usCurr = new CurrencyDenominationFactory<>(new UsCurrencyDenomination());
        System.out.println(CurrencyDenominationImpl.populateCurrencyDenomination(usCurr.getCurrencyDenomination().getCoinList(),AMOUNT));
    }
}
