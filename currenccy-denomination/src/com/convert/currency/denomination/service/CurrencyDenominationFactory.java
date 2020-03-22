package com.convert.currency.denomination.service;

public class CurrencyDenominationFactory<T> {
    T currencyDenomination;
    public CurrencyDenominationFactory(T currencyDenomination){
        this.currencyDenomination = currencyDenomination;
    }
    public T getCurrencyDenomination(){
        return this.currencyDenomination;
    }
}
