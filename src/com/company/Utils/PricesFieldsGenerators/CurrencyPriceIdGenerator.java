package com.company.Utils.PricesFieldsGenerators;

public class CurrencyPriceIdGenerator {
    public int currencyPriceIdGenerator(){
        int currencyPriceId=(int)(Math.random()*100000000);
        return currencyPriceId;
    }
}
